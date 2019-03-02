//package com.pat.test.advance;
//
//import java.text.BreakIterator;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
//
//public class Main1033 {
//
//	static class Node {
//		double price;
//		double dist;
//	}
//
//	public static void main(String[] args) throws Exception {
//
//		Reader.init(System.in);
//
//		int capacity = Reader.nextInt();
//		double dist = Reader.nextDouble();
//		double distAvg = Reader.nextDouble();
//		int gasNum = Reader.nextInt();
//		double maxdist = 0;
//		double cheapestPrice = Double.MAX_VALUE;
//		List<Node> list = new ArrayList<Node>();
//		for (int i = 0; i < gasNum; i++) {
//			Node node = new Node();
//			node.price = Reader.nextDouble();
//			node.dist = Reader.nextInt();
//			list.add(node);
//		}
//		Node start = null;
//		for (int i = 0; i < list.size(); i++) {
//			Node node = list.get(i);
//			if (node.dist == 0) {
//				start = node;
////				list.remove(i);
//				break;
//			}
//		}
//		if (start == null) {
//			System.out.println("The maximum travel distance = 0.00");
//		} else {
//
//			Collections.sort(list, new Comparator<Node>() {
//
//				@Override
//				public int compare(Node o1, Node o2) {
//					// TODO Auto-generated method stub
//					return Double.valueOf(o1.price).compareTo(
//							Double.valueOf(o2.price));
//				}
//
//			});
//			while (true) {
//				if (dist - start.dist < capacity * distAvg) {
//
//					maxdist = dist;
//					cheapestPrice += start.price * (dist - start.dist)
//							/ distAvg;
//					break;
//
//				} else {
//
//					Node node = getNode(start.dist, list);
//					if(node==null){
//						if(dist-start.dist<capacity*distAvg){
//							maxdist = dist;
//							cheapestPrice += start.price * (dist - start.dist)
//									/ distAvg;
//							break;
//						}else{
//							maxdist+= capacity * distAvg;
//							break;
//						}
//					}
//					if (node.dist - start.dist > capacity * distAvg) {
//						maxdist+= capacity * distAvg;
//						break;
//					} else {
//						cheapestPrice += start.price * (node.dist - start.dist)/distAvg;
//						maxdist = node.dist;
//						start = node;
//					}
//
//				}
//			}
//
//			if (maxdist == dist) {
//				System.out.println(cheapestPrice);
//			} else {
//				System.out.println(maxdist);
//			}
//
//		}
//
//		// if (cheapestPrice != Double.MAX_EXPONENT) {
//		// System.out.format("%.2f", cheapestPrice);
//		// } else {
//		// System.out.format("The maximum travel distance = %.2f", maxdist);
//		// }
//
//	}
//
////	private static Node getNode(double dist, List<Node> list) {
////		// TODO Auto-generated method stub
////		
////		Node node=null;
////		for (int i = 0; i < list.size(); i++) {
////			if (list.get(i).dist > dist&&list.get) {
////				node=list.get(i);
////			}
////		}
////		return null;
////	}
//
//}
