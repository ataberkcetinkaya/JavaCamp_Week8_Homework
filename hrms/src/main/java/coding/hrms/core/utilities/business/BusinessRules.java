package coding.hrms.core.utilities.business;

import coding.hrms.core.utilities.results.Result;
import coding.hrms.core.utilities.results.SuccessResult;

public class BusinessRules {
	public static Result run(final Result... logics) {
		for (final Result logic : logics)
			if (!logic.isSuccess())
				return logic;
		return new SuccessResult();
	}
}