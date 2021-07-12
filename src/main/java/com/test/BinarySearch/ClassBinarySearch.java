package com.test.BinarySearch;

import java.util.Comparator;

public class ClassBinarySearch {

    static class PhyscData{
        private final String name;
        private final int height;
        private final double vision;

        public PhyscData(String name, int height, double vision){
            this.name = name;
            this.height = height;
            this.vision = vision;
        }

        public String toString() {
            return name + " " + height + " " + vision;
        }

        public static final Comparator<PhyscData> HEIGHT_ORDER
                = new HeightOrderComparator();

        public static final Comparator<PhyscData> VISION_ORDER
                = new VisionOrderComparator();

        private static class HeightOrderComparator implements Comparator<PhyscData>{
            public int compare(PhyscData d1, PhyscData d2){
                return Integer.compare(d1.height, d2.height);
            }
        }

        private static class VisionOrderComparator implements Comparator<PhyscData>{
            public int compare(PhyscData d1, PhyscData d2){
                return Double.compare(d1.vision, d2.vision);
            }
        }
    }
}
