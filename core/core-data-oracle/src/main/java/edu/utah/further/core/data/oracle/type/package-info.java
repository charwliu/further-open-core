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
/*******************************************************************************
 * Source File: package-info.java
 * <p>
 * Declares Hibernate annotations for all model classes in this package.
 * -------------------------------------------------------------------------<br>
 * (c) 2008-2013 FURTHeR Project, Health Sciences IT, University of Utah<br>
 * Contact: {@code <further@utah.edu>}<br>
 * Biomedical Informatics, 26 South 2000 East<br>
 * Room 5775 HSEB, Salt Lake City, UT 84112<br>
 * Day Phone: 1-801-581-4080<br>
 * -------------------------------------------------------------------------
 *
 * @author Oren E. Livne {@code <oren.livne@utah.edu>}
 * @version Oct 10, 2008
 ******************************************************************************/
@TypeDefs(
{
		@TypeDef(name = "xml-type", typeClass = OracleXmlType.class),
		@TypeDef(name = "xml-type-as-string", typeClass = OracleXmlTypeAsString.class),
		@TypeDef(name = "xml-type-length", typeClass = OracleXmlTypeLength.class),
                @TypeDef(name = "string-field-big-integer-column", typeClass = StringFieldBigIntegerColumn.class)
 })
package edu.utah.further.core.data.oracle.type;

import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

