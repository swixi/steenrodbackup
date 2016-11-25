import java.io.IOException;
import java.util.*;

public class SelfMap {
	public static Map<List<Integer>, List<int[][]>> coproductData = new HashMap<List<Integer>, List<int[][]>>();
	
	public static void main(String[] args) throws IOException {
		 long start = System.nanoTime();

		 //System.out.println(cleanup(writeAsBasis("31 30")));
		
		 //System.out.println(DualSteenrod.milnorDimension(new int[]{1, 5, 3, 0}));
		// System.out.println(DualSteenrod.milnorDegree(new int[]{1, 7, 2, 3, 3, 1}));
		 
		 //List<int[]> blah = new ArrayList<int[]>();
		// blah.add(new int[] {0, 1});
		 //blah.add(new int[] {2, 0});
		 //System.out.println(Arrays.toString(DualSteenrod.milnorMultiply(blah)));
		 
		 /*
		 Function function = new Function();
		 MilnorElement temp = new MilnorElement(new int[]{1,1});
		 temp.add(new int[]{1,1});
		 function.set(new int[]{1,1}, temp);
		 System.out.println(function.get(new int[]{1,1}));
		 System.out.println(function.get(new int[0]));
		 System.out.println(function.get(null));
		 
		 HashMap<List<Integer>, int[]> test = new HashMap<List<Integer>, int[]>();
		 test.put(null, null);
		 System.out.println(test.size());
		 */
		 
		 
		 /*
		 DualAn dualA2 = new DualAn(2);
		 //dualA2.printAllData();
		 //dualA2.printMonomialsAtOrBelow(DualSteenrod.milnorDimension(dualA2.topClass()));
		 //dualA2.printMonomialsAtOrBelow(5);
		 
		 DualSteenrod A_mod_A2 = new DualSteenrod(null);
		 A_mod_A2.setGenerators(DualSteenrod.getDualAModAnGenerators(2));
		 
		 
		 System.out.println(sMaps(dualA2, A_mod_A2));
		 
		 int topClassDim = DualSteenrod.milnorDimension(dualA2.topClass());
		 Integer[] keys = Tools.keysToSortedArray(A_mod_A2.getMonomialsAtOrBelow(topClassDim));
		 Map<Integer, List<int[]>> filteredMonomials = dualA2.getMonomialsByFilter(keys);
		 dualA2.printMonomials(filteredMonomials);
		 
		 dualA2.printMonomialsAtOrBelow(topClassDim);
		 A_mod_A2.printMonomialsAtOrBelow(topClassDim);
		 */
		 
		 
		 /*
		 //TODO make sure running coproduct on [1,4] gives the same as [1,2,1,2] etc
		 List<int[]> input = new ArrayList<int[]>();
		 input.add(new int[]{1, 3, 2, 1});
		 //input.add(new int[]{1, 5});
		 //input.add(new int[]{2, 1});
		 List<int[][]> tensorsUnreduced = DualSteenrod.coproduct(input);
		 List<int[][]> tensors = (List<int[][]>) DualSteenrod.reduceMod2(tensorsUnreduced);
		 
		 System.out.println(tensorsUnreduced.size());
		 System.out.println(tensors.size());
		 
		 for(int i = 0; i < tensorsUnreduced.size(); i++) {
			 System.out.print(Arrays.toString(tensorsUnreduced.get(i)[0]) + " X " + Arrays.toString(tensorsUnreduced.get(i)[1]) + (    (i == (tensorsUnreduced.size() - 1)) ? "" : " + "             )     );
		 }
		 
		 System.out.println("");
		 
		 for(int i = 0; i < tensors.size(); i++) {
			 System.out.print(Arrays.toString(tensors.get(i)[0]) + " X " + Arrays.toString(tensors.get(i)[1]) + (    (i == (tensors.size() - 1)) ? "" : " + "             )     );
		 }
		 
		 System.out.println("");
		 
		 DualSteenrod.removePrimitives(tensors);
		 
		 for(int i = 0; i < tensors.size(); i++) {
			 System.out.print(Arrays.toString(tensors.get(i)[0]) + " X " + Arrays.toString(tensors.get(i)[1]) + (    (i == (tensors.size() - 1)) ? "" : " + "             )     );
		 }
		 
		 System.out.println("");
		 */
		 
		 
		 /*
		 System.out.println(Arrays.toString(Tools.dynamicToFixedForm(DualSteenrod.applyRelations(new int[]{1,2,1,1,2,1,5,6,5,7,8,1}), 8)));
		 System.out.println(Arrays.toString(DualSteenrod.applyRelations(new int[]{1,2, 2,0, 3, 7, 19, 1})));
		 System.out.println(Arrays.toString(Tools.fixedToDynamicForm(new int[]{3, 0, 0, 5, 0, 0, 3, 0, 0, 0, 0, 13})));
		 
		 DualAn dualAn = new DualAn(2);
		 int[] test = new int[]{1,9, 2, 5, 3, 5};
		 System.out.println(Arrays.toString(DualSteenrod.applyRelations(test, dualAn.getRelations())));
		 System.out.println(Arrays.toString(DualSteenrod.remainder(test, dualAn.getRelations())));
		 
		 int[][] test2 = new int[1][1];
		 System.out.println(instanceOfTest(test2));
		 */
		 
		 /*
		 List<int[]> tempList = new ArrayList<int[]>();
		 tempList.add(new int[0]);
		 System.out.println(Arrays.toString(tempList.get(0)));
		 tempList = (List<int[]>) DualSteenrod.reduceMod2(tempList);
		 
		 for(int i = 0; i<tempList.size(); i++) 
			 System.out.println(Arrays.toString(tempList.get(i)));
		 */
		 
		 
		 
		 DualAn dualAn = new DualAn(1);
		 Function sMap = dualAn.generatesMap();
		 
		 
		 System.out.println(sMap);
		 
		 System.out.println(dualAn.generatejMap(sMap));
		 
		 
		 
		 
		 
		 
		 /*
		 int[][] test1 = new int[2][];
		 int[][] test2 = new int[2][];
		 test1[0] = new int[]{1, 1};
		 test1[1] = new int[]{2, 2};
		 test2[0] = new int[]{3, 1};
		 test2[1] = new int[]{4, 5};
		 
		 System.out.println(DualSteenrod.intArrayToList(test1));
		 System.out.println(Arrays.toString(DualSteenrod.listToIntArray(DualSteenrod.intArrayToList(test1))[0]));
		 System.out.println(Arrays.toString(DualSteenrod.listToIntArray(DualSteenrod.intArrayToList(test1))[1]));
		 */
		 
		 
		// System.out.println(Arrays.toString(DualSteenrod.cleanup(new int[]{1, 5, 2, 1, 1, -1}, dualA2.getRelations())));
		 //System.out.println(dualA2.getRelations().get(4));
		 
		 
		 
		 
		 
		 /*Map<Integer, Integer> test = new HashMap<Integer, Integer>();
		 test.put(1, 2);
		 test.put(2, null);
		 
		 System.out.println(test.size());
		 System.out.println(test.get(2));
		 
		 test.remove(2);
		 
		 System.out.println(test.size());
		 System.out.println(test.get(2));*/
		 
		//// int[] test = new int[]{1, 7, 2, 2, 2, 0, 3, 0, 1, 4, 2, 7, 4, 9};
		 //Map<Integer, Integer> testMap = new HashMap<Integer, Integer>();
		 //System.out.println(Arrays.toString(DualSteenrod.cleanup(test, dualA2.getRelations())));
		 
		 
		 
		
		
		long end = System.nanoTime();
		System.out.println("time: " + ((double)(end-start))/1000000 + " ms");
	}
	
	public static boolean instanceOfTest(Object o) {
		return (o instanceof int[]);
	}
	
	public static int sMaps(DualAn dualAn, DualSteenrod AmodAn) {
		int count = 1;
		int topClassDim = DualSteenrod.milnorDimension(dualAn.topClass());
		Map<Integer, List<int[]>> AmodAnMonomials = AmodAn.getMonomialsAtOrBelow(topClassDim);
		Map<Integer, List<int[]>> dualAnMonomials = dualAn.getMonomialsByFilter(Tools.keysToSortedArray(AmodAnMonomials));
		
		for(int i = 1; i <= topClassDim; i++) {
			//if both dual An and A mod An have monomials in dimension i, count the number of maps.
			//each monomial from An can map to any of the monomials from A mod An OR zero (so that's what the  + 1 is)
			if((dualAnMonomials.get(i) != null) && (AmodAnMonomials.get(i) != null)) 
				count *= Math.pow(AmodAnMonomials.get(i).size() + 1, dualAnMonomials.get(i).size());
		}
		
		return count;
	}
}
