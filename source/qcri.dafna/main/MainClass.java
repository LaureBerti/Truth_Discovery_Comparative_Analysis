package main;

import qcri.dafna.dataModel.data.Globals;
import qcri.dafna.dataModel.dataSet.dataSetFormatter.BiographyDataSetReadOldWriteNew;
import qcri.dafna.dataModel.dataSet.dataSetFormatter.OldBooksDataSetFormatter;
import qcri.dafna.dataModel.dataSet.dataSetFormatter.OldFlightDataSetReader;
import qcri.dafna.dataModel.dataSet.dataSetFormatter.PopulationBiographyDataSetGenerator;
import qcri.dafna.dataModel.dataSet.dataSetFormatter.PopulationDatasetReadOldWriteNew;
import qcri.dafna.dataModel.dataSet.dataSetFormatter.WeatherReadOldWriteNew;
import qcri.dafna.dataModel.dataSetReader.BiographyTruthReader;
import qcri.dafna.dataModel.quality.dataQuality.DataItemMeasures;

public class MainClass {
	
	public static void main(String[] args) {
//		for (int i = 0 ; i < 50; i++) {
//			double c = 	(Math.exp(i/ (/*sources.size()*/50-1)) - 1) 
////					/
////					(Math.E - 1)
//				;
//			int cov = (int)(
//					((double)1000/*dataItems.size()*/-1) *
//						(Math.exp(7*i/ (/*sources.size()*/50-1)) - 1) /
//						(Math.exp(7) - 1)
//					);
//			cov++;
//			System.out.println(cov);
//		}

		readOldWeatherFilesWriteNewFiles();

//		readOldPopulationAndBiographyFilesWriteNewFiles();

		//		readOldPopulationFilesWriteNewFiles();
//		BiographyTruthReader biotru = new BiographyTruthReader(null);
//		biotru.readDirectoryFiles();

//		readOldBiographyFilesWriteNewFiles();

//		readOldFlightFilesWriteNewFiles();
//		readOldBookFilesWriteNewFilesSingleClaimValue();
//		readOldBookFilesWriteNewFiles();
	}

	static private void readOldWeatherFilesWriteNewFiles() {
		WeatherReadOldWriteNew weatherReadOldWriteNew = new WeatherReadOldWriteNew();
		weatherReadOldWriteNew.readOldWeatherFileAndWriteNewFiles(Globals.delimiterText);
	}

	static private void readOldPopulationAndBiographyFilesWriteNewFiles() {
		PopulationBiographyDataSetGenerator populationBiographyDataSetGenerator = new PopulationBiographyDataSetGenerator();
		populationBiographyDataSetGenerator.readOldPopulationAndBiographyFilesAndWriteNewFiles(Globals.delimiterText);
	}
	static private void readOldPopulationFilesWriteNewFiles() {
		PopulationDatasetReadOldWriteNew population = new PopulationDatasetReadOldWriteNew();
		population.readOldPopulationFileAndWriteNewFiles(Globals.delimiterText);
	}
	/**
	 * Read the flight files, with their old format, 
	 * and Write the new formatted files.
	 * @param dataset to be filled with the read flight data
	 */
	static private void readOldFlightFilesWriteNewFiles() {
		OldFlightDataSetReader dsw = new OldFlightDataSetReader();
		System.out.println("Started");
		dsw.readOldFlightFileAndWriteNewFiles(Globals.delimiterText);
		System.out.println("Done");
	}
	static private void readOldBookFilesWriteNewFiles() {
		OldBooksDataSetFormatter bookFormatter = new OldBooksDataSetFormatter();
		System.out.println("Started");
		bookFormatter.readOldBooksWriteFormattedBooks(Globals.delimiterText, false);
		System.out.println("Done");
	}
	static private void readOldBookFilesWriteNewFilesSingleClaimValue() {
		OldBooksDataSetFormatter bookFormatter = new OldBooksDataSetFormatter();
		System.out.println("Started");
		bookFormatter.readOldBooksWriteFormattedBooks(Globals.delimiterText, true);
		System.out.println("Done");
	}
	static private void readOldBiographyFilesWriteNewFiles() {
		BiographyDataSetReadOldWriteNew bio = new BiographyDataSetReadOldWriteNew();
		System.out.println("Started");
		bio.readOldBiographyFileAndWriteNewFiles(Globals.delimiterText);
		System.out.println("Done");
	}
}
