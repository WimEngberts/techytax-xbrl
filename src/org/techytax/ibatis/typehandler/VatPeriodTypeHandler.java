/**
 * Copyright 2014 Hans Beemsterboer
 * 
 * This file is part of the TechyTax program.
 *
 * TechyTax is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * TechyTax is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with TechyTax; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */
package org.techytax.ibatis.typehandler;

import java.sql.SQLException;
import java.sql.Types;

import org.techytax.domain.VatPeriodType;

import com.ibatis.sqlmap.client.extensions.ParameterSetter;
import com.ibatis.sqlmap.client.extensions.ResultGetter;
import com.ibatis.sqlmap.client.extensions.TypeHandlerCallback;

public class VatPeriodTypeHandler implements TypeHandlerCallback {
	public Object getResult(ResultGetter getter) throws SQLException {
		int value = getter.getInt();
		if (getter.wasNull()) {
			return null;
		}
		VatPeriodType vatPeriodType = VatPeriodType.getInstance(value);

		return vatPeriodType;
	}

	public void setParameter(ParameterSetter setter, Object parameter)
			throws SQLException {
		if (parameter == null) {
			setter.setNull(Types.INTEGER);
		} else {
			VatPeriodType vatPeriodType = (VatPeriodType) parameter;
			setter.setInt(vatPeriodType.ordinal());
		}
	}

	public Object valueOf(String s) {
		return s;
	}
}