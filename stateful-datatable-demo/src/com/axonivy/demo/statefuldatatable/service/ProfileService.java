package com.axonivy.demo.statefuldatatable.service;

import com.axonivy.demo.statefuldatatable.entity.Profile;

public class ProfileService {
	public static Profile copyProfile(Profile originalProfile) {
		Profile profileCopy = new Profile();
		profileCopy.setFilters(originalProfile.getFilters());
		profileCopy.setProfileName(originalProfile.getProfileName());
		profileCopy.setProfileType(originalProfile.getProfileType());
		profileCopy.setSorting(originalProfile.getSorting());
		profileCopy.setUser(originalProfile.getUser());
		profileCopy.setVisibility(originalProfile.getVisibility());
		
		return profileCopy;
	}
}
