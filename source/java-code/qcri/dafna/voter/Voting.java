package qcri.dafna.voter;

import java.util.List;

import qcri.dafna.dataModel.data.DataSet;
import qcri.dafna.dataModel.data.SourceClaim;
import qcri.dafna.dataModel.data.ValueBucket;

public class Voting extends Voter{

	public Voting(DataSet dataSet) {
		super(dataSet);
	}
	@Override
	public int runVoter(boolean convergence100) {
		int numOfSrc, temp;
		ValueBucket maxVoteBucket;
		for (List<ValueBucket> bucketList : dataSet.getDataItemsBuckets().values()) {
			numOfSrc = bucketList.get(0).getSourcesKeys().size();
			maxVoteBucket = bucketList.get(0);
			for (ValueBucket b : bucketList) {
				temp = b.getSourcesKeys().size();
				if (temp > numOfSrc) {
					maxVoteBucket = b;
					numOfSrc = temp;
				}
			}
			for (SourceClaim claim : maxVoteBucket.getClaims()) {
				claim.setTrueClaimByVoter(true);
			}
		}
		return 1;
	}
	@Override
	protected void initParameters() {
		singlePropertyValue = false; 
		onlyMaxValueIsTrue = true;
	}
}
