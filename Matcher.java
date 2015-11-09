public class Matcher {
    public Matcher() {}
   
    public boolean match(int[] expected, int[] actual, 
    					 int clipLimit, int delta) 
    {
        clipValues(actual, clipLimit);
        
        if (lenghtDiff(expected, actual))
            return false; 

        return checkExpectedDelta(expected, actual, delta);
    }

	private boolean checkExpectedDelta(int[] expected, int[] actual, int delta) {
		for (int i = 0; i < actual.length; i++)
            if (Math.abs(expected[i] - actual[i]) > delta)
                return false;

	    return true; // new one
	}

	private void clipValues(int[] actual, int clipLimit) {
		for (int i = 0; i < actual.length; i++)
            if (actual[i] > clipLimit)
                actual[i] = clipLimit;
	}

	private boolean lenghtDiff(int[] expected, int[] actual) {
		return actual.length != expected.length;
	}
}
