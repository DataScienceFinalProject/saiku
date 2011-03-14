/*
 * Copyright (C) 2011 Paul Stoellberger
 *
 * This program is free software; you can redistribute it and/or modify it 
 * under the terms of the GNU General Public License as published by the Free 
 * Software Foundation; either version 2 of the License, or (at your option) 
 * any later version.
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License along 
 * with this program; if not, write to the Free Software Foundation, Inc., 
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA 
 *
 */

package org.saiku.olap.dto;


public class SaikuSelection extends AbstractSaikuObject {
	
	private String caption;
	private String dimensionUniqueName;
	private String hierarchyUniqueName;
	
	public static enum Type {
		MEMBER,
		LEVEL
	}
	
	private Type type;
	
	public SaikuSelection() {
		super(null,null);
		throw new RuntimeException("Unsupported Constructor. Serialization only");
	}

	public SaikuSelection(String name, String uniqueName, String caption, String dimensionUniqueName, String hierarchyUniqueName, Type type ) {
		super(uniqueName,name);
		this.caption = caption;
		this.dimensionUniqueName = dimensionUniqueName;
		this.hierarchyUniqueName = hierarchyUniqueName;
		this.type = type;
	}

	public String getHierarchyUniqueName() {
		return hierarchyUniqueName;
	}

	public String getCaption() {
		return caption;
	}
	
	public String getDimensionUniqueName() {
		return dimensionUniqueName;
	}
	
	public Type getType() {
		return type;
	}

}
