package qcri.dafna.experiment;

import qcri.dafna.dataModel.data.DataSet;
import qcri.dafna.dataModel.data.Globals;
import qcri.dafna.voter.ExperimentDataSetConstructor;
import qcri.dafna.voter.ExperimentDataSetConstructor.Experiment;

public class SyntheticBoleanExperiment extends qcri.dafna.experiment.Experiment{

//	public static void main(String[] args) {
//		System.out.println("Start Boolean Synthetic Experiment...");
//		launchSyntheticBoleanExperiment();
//		System.out.println("End Boolean Synthetic Experiment.");
//	}
	static private void launchSyntheticBoleanExperiment() {
		DataSet dataSet = ExperimentDataSetConstructor.readDataSet(0.0, 0.0, Globals.directory_syntheticDataSet_Boolean, 
				0.0, false, null, Experiment.BooleanSynthetic, null);

		DataSet dataSetTrueFalse = ExperimentDataSetConstructor.readDataSet(0.0, 0.0, Globals.directory_syntheticDataSet_BooleanTrueAndFalse, 
				0.0, false, null, Experiment.BooleanSyntheticTF, null);

		boolean convergence100 = true;
		boolean runSyntheticBoolean = true;
		boolean runLTM = true;
		runExperiment(convergence100, dataSetTrueFalse, "syntheticBoolean", runLTM, dataSet, runSyntheticBoolean);
	}
}
