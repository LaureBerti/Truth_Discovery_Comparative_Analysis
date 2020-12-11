package qcri.dafna.experiment;

import java.util.Date;

import qcri.dafna.dataModel.data.DataSet;
import qcri.dafna.dataModel.data.Globals;
import qcri.dafna.dataModel.quality.dataQuality.logger.DataQualityLogger;
import qcri.dafna.voter.ExperimentDataSetConstructor;
import qcri.dafna.voter.ExperimentDataSetConstructor.Experiment;

public class PopulationExperiment extends qcri.dafna.experiment.Experiment{

	private static final double TOLERANCE_FACTOR = 0.01;
	/**
	 * for good performance enlarge the Java virtual machine memory:
	 * set the argument: -Xmx4G
	 */
//	public static void main(String[] args) {
//		System.out.println("Start Population Experiment...");
//		Globals.tolerance_Factor = TOLERANCE_FACTOR;
//		launchDataSet_PopulationExperiment();
//		System.out.println("End Population Experiment.");
//	}

	static private void launchDataSet_PopulationExperiment() {
		Date d = new Date();System.out.println(d.toString());
		DataSet dataSet = ExperimentDataSetConstructor.readDataSet(Globals.starting_Confidence,Globals.starting_trustworthiness, 
				Globals.directory_formattedDAFNADataset_PopulationClaimsFolder, Globals.tolerance_Factor, false, null ,Experiment.Population, null);

		boolean convergence100 = false;
		boolean runSyntheticBoolean = false;
		boolean runLTM = false;
		String dir = Globals.directory_FormattedPopulationFolder + "/experimentResult";

		runExperiment(convergence100, dataSet, dir, runLTM, null, runSyntheticBoolean);

	}
}
