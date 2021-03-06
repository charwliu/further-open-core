/**
 * Copyright (C) [2013] [The FURTHeR Project]
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package edu.utah.further.fqe.impl.internal.mock;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import edu.utah.further.core.api.context.Implementation;
import edu.utah.further.core.api.context.Mock;
import edu.utah.further.fqe.impl.service.plan.DeEvaluator;
import edu.utah.further.fqe.impl.service.plan.DependencyExpression;

/**
 * A mock DE evaluator that always returns a constant long value. Suitable for query plan
 * unit tests.
 * <p>
 * -----------------------------------------------------------------------------------<br>
 * (c) 2008-2013 FURTHeR Project, Health Sciences IT, University of Utah<br>
 * Contact: {@code <further@utah.edu>}<br>
 * Biomedical Informatics, 26 South 2000 East<br>
 * Room 5775 HSEB, Salt Lake City, UT 84112<br>
 * Day Phone: 1-801-581-4080<br>
 * -----------------------------------------------------------------------------------
 * 
 * @author Oren E. Livne {@code <oren.livne@utah.edu>}
 * @version Dec 23, 2010
 */
@Implementation
@Mock
@Component("deEvaluator")
public class DeEvaluatorMockImpl implements DeEvaluator
{
	// ========================= DEPENDENCIES ==============================

	/**
	 * Desired output number results from a mock data source.
	 */
	@Resource(name = "mockNumResultsDependentQuery")
	private Long numResults;

	// ========================= IMPL: DeEvaluator =========================

	/**
	 * @see edu.utah.further.fqe.impl.service.plan.DeEvaluator#evaluate(edu.utah.further.fqe.impl.service.plan.DependencyExpression)
	 * @param expression
	 * @return
	 */
	@Override
	public Long evaluate(final DependencyExpression expression)
	{
		return numResults;
	}

}
