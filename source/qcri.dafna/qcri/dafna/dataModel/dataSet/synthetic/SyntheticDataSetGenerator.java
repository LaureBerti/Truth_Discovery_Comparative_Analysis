package qcri.dafna.dataModel.dataSet.synthetic;

import qcri.dafna.dataModel.data.Globals;

public class SyntheticDataSetGenerator {

	public static void main(String[] args) {
		double groundTruthTrueFactor = 0.6;
		AbstractSyntheticDataSetCreator booleanDataSet = new BooleanDataSetCreator(groundTruthTrueFactor, Globals.directory_syntheticDataSet_BooleanTrueAndFalse + "/booleanSynth",
				Globals.directory_syntheticDataSet_BooleanTrueAndFalse_Truth + "/truth.txt");
		
		String fileName = Globals.directory_syntheticDataSet_Boolean + "/booleanSynth";
		String truthtFileName = Globals.directory_syntheticDataSet_Boolean_Truth + "/truth";
		int numOfSources = 50;
		int numOFObjetcs = 1000;
		int numOfProperties = 1;

		boolean randomFactors = true;
		/* when random factors is true the next factors are not used */
		double srcErrorFactor = 0.15;
		double objectDifficulty = 0.05;
		double sourceIgnoranceFactor = 0.2;
		boolean appendToFile = false;

		booleanDataSet.generateSyntheticDataSet(numOfSources, numOFObjetcs, numOfProperties, randomFactors, 
				srcErrorFactor, objectDifficulty, sourceIgnoranceFactor, fileName, truthtFileName, appendToFile);

	}

}
