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
package edu.utah.further.ds.i2b2.model.impl.to;

import static edu.utah.further.core.api.math.ArithmeticUtil.newBigIntegerNullSafe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import edu.utah.further.ds.i2b2.model.api.domain.ObservationFactId;
import edu.utah.further.ds.i2b2.model.api.to.ObservationFactIdTo;
import edu.utah.further.ds.i2b2.model.impl.domain.ObservationFactPK;

/**
 * Observation Fact Primary Key To
 * <p>
 * -----------------------------------------------------------------------------------<br>
 * (c) 2008-2013 FURTHeR Project, Health Sciences IT, University of Utah<br>
 * Contact: {@code <further@utah.edu>}<br>
 * Biomedical Informatics, 26 South 2000 East<br>
 * Room 5775 HSEB, Salt Lake City, UT 84112<br>
 * Day Phone: 1-801-581-4080<br>
 * -----------------------------------------------------------------------------------
 * 
 * @author {@code Rick L. Bradshaw <rick.bradshaw@utah.edu>}
 * @version April 15, 2010
 */
@XmlRootElement(name = "ObservationFactPK")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObservationFactPK", propOrder =
{ "encounterNum", "conceptCd", "providerId", "startDate", "modifierCd" })
public class ObservationFactPKToImpl implements ObservationFactIdTo
{

	@XmlElement(required = true)
	private String encounterNum;
	@XmlElement(required = true)
	private String conceptCd;
	@XmlElement(required = true)
	private String providerId;
	@XmlElement(required = true)
	@XmlSchemaType(name = "date")
	private XMLGregorianCalendar startDate;
	@XmlElement(required = true)
	private String modifierCd;

	/**
	 * @return
	 * @see edu.utah.further.ds.i2b2.model.api.to.ObservationFactIdTo#getEncounterNum()
	 */
	@Override
	public String getEncounterNum()
	{
		return encounterNum;
	}

	/**
	 * @param value
	 * @see edu.utah.further.ds.i2b2.model.api.to.ObservationFactIdTo#setEncounterNum(java.lang.String)
	 */
	@Override
	public void setEncounterNum(final String value)
	{
		this.encounterNum = value;
	}

	/**
	 * @return
	 * @see edu.utah.further.ds.i2b2.model.api.to.ObservationFactIdTo#getConceptCd()
	 */
	@Override
	public String getConceptCd()
	{
		return conceptCd;
	}

	/**
	 * @param value
	 * @see edu.utah.further.ds.i2b2.model.api.to.ObservationFactIdTo#setConceptCd(java.lang.String)
	 */
	@Override
	public void setConceptCd(final String value)
	{
		this.conceptCd = value;
	}

	/**
	 * @return
	 * @see edu.utah.further.ds.i2b2.model.api.to.ObservationFactIdTo#getProviderId()
	 */
	@Override
	public String getProviderId()
	{
		return providerId;
	}

	/**
	 * @param value
	 * @see edu.utah.further.ds.i2b2.model.api.to.ObservationFactIdTo#setProviderId(java.lang.String)
	 */
	@Override
	public void setProviderId(final String value)
	{
		this.providerId = value;
	}

	/**
	 * @return
	 * @see edu.utah.further.ds.i2b2.model.api.to.ObservationFactIdTo#getStartDate()
	 */
	@Override
	public XMLGregorianCalendar getStartDate()
	{
		return startDate;
	}

	/**
	 * @param value
	 * @see edu.utah.further.ds.i2b2.model.api.to.ObservationFactIdTo#setStartDate(javax.xml.datatype.XMLGregorianCalendar)
	 */
	@Override
	public void setStartDate(final XMLGregorianCalendar value)
	{
		this.startDate = value;
	}

	/**
	 * @return
	 * @see edu.utah.further.ds.i2b2.model.api.to.ObservationFactIdTo#getModifierCd()
	 */
	@Override
	public String getModifierCd()
	{
		return modifierCd;
	}

	/**
	 * @param value
	 * @see edu.utah.further.ds.i2b2.model.api.to.ObservationFactIdTo#setModifierCd(java.lang.String)
	 */
	@Override
	public void setModifierCd(final String value)
	{
		this.modifierCd = value;
	}

	/**
	 * @param obj
	 * @return
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(final Object object)
	{
		if (object == null)
			return false;
		if (object == this)
			return true;
		if (getClass() != object.getClass())
			return false;

		final ObservationFactId that = (ObservationFactId) object;
		return new EqualsBuilder()
				.append(this.getConceptCd(), that.getConceptCd())
				.append(this.getEncounterNum(), that.getEncounterNum())
				.append(this.getModifierCd(), that.getModifierCd())
				.append(this.getProviderId(), that.getProviderId())
				.append(this.getStartDate(), that.getStartDate())
				.isEquals();
	}

	/**
	 * @return
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode()
	{
		return new HashCodeBuilder()
				.append(this.getConceptCd())
				.append(this.getEncounterNum())
				.append(this.getModifierCd())
				.append(this.getProviderId())
				.append(this.getStartDate())
				.toHashCode();
	}

	/**
	 * @return
	 * @see edu.utah.further.core.api.lang.PubliclyCloneable#copy()
	 */
	@Override
	public ObservationFactId copy()
	{
		final ObservationFactPK entity = new ObservationFactPK();
		entity.setConceptCd(this.getConceptCd());
		entity.setEncounterNum(newBigIntegerNullSafe(this.getEncounterNum()));
		entity.setModifierCd(this.getModifierCd());
		entity.setProviderId(this.getProviderId());
		entity.setStartDate(this.getStartDate() != null ? this
				.getStartDate()
				.toGregorianCalendar()
				.getTime() : null);
		return entity;
	}

}
