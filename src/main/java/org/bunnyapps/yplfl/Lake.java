/* Copyright BunnyApps
 * Licensed to CS Systèmes d'Information (CS) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * CS licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.bunnyapps.yplfl;

public enum Lake {

	/** Unknown lake. */
	UNKNOWN(Country.UNKNOWN, "unknown", Double.NaN, Double.NaN, Double.NaN, false, false);

	/** Country where the lake is setting. */
	private final Country country;

	/** Lake name. */
	private final String name;

	/** Lake geodetic latitude [°]. */
	private final double latitude;

	/** Lake geodetic longitude [°]. */
	private final double longitude;

	/** Lake geodetic altitde [m]. */
	private final double altitude;

	/** Flag for parking availability. */
	private final boolean isParking;

	/** Flag for lake free access. */
	private final boolean isFree;

	/**
	 * Build a new instance.
	 * @param country country where the lake is setting
	 * @param name lake name
	 * @param latitude lake geodetic latitude in degrees
	 * @param longitude lake geodetic longitude in degrees
	 * @param altitude lake altitude in meters
	 * @param isParking true if a parking is available
	 * @param isFree true is the lake is free access
	 */
	Lake(final Country country, final String name,
		 final double latitude, final double longitude,
		 final double altitude, final boolean isParking,
		 final boolean isFree) {
		this.country   = country;
		this.name      = name;
		this.latitude  = latitude;
		this.longitude = longitude;
		this.altitude  = altitude;
		this.isParking = isParking;
		this.isFree    = isFree;
	}

	/** Get the country of the lake.
	 * @return country
	 */
	public Country getCountry() {
		return country;
	}

	/** Get lake name.
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/** Get the geodetic latitude of the lake.
	 * @return latitude in degrees
	 */
	public double getLatitude() {
		return latitude;
	}

	/** Get the geodetic longitude of the lake.
	 * @return longitude in degrees
	 */
	public double getLongitude() {
		return longitude;
	}

	/** Get the altitude of the lake.
	 * @return altitude in meters
	 */
	public double getAltitude() {
		return altitude;
	}

	/** Get the flag for parking availability.
	 * @return true if a parking is available
	 */
	public boolean isParking() {
		return isParking;
	}

	/** Get the flag for free access.
	 * @return true if the lake is free access
	 */
	public boolean isFree() {
		return isFree;
	}

}
