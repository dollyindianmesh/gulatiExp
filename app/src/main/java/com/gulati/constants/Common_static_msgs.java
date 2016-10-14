package com.gulati.constants;

public class Common_static_msgs {
	
	//mSG TO DISPLAY THROUGH OUT THE APP

	// login page
	public static String enter_userid = "Please enter email id";
	public static String enter_password = "Please enter password";

	// sign up
	public static String enter_firstname = "Please enter first name";
	public static String enter_companyname = "Please enter Company name";
	public static String enter_emailid = "Please enter Email LocationAddress";
	public static String enter_address = "Please enter LocationAddress";

	public static String enter_city = "Please enter City";
	public static String enter_country = "Please enter Country";
	public static String enter_valid_emailid = "Please enter Valid Email Id";
	public static String enter_contactno = "Please enter Contact No";
	public static String enter_new_password = "Please enter password";
	public static String password_too_short = "Password is too short. please enter atleast 8 character";
	public static String enter_cofirmpassword = "Please enter confirm password";
	public static String enter_passwordnotmatched = "Confirm password does not match";

	public static String response_error_msg = "";

	// Edit Profile
	public static String profile_updated_success = "Your Profile has been updated successfully";

	// Home Page
	public static String choose_vehicle_type = "Please choose vehicle type";
	public static String choose_pickup_location = "Please choose pickup location.";
	public static String choose_drop_location = "Please choose drop location.";

	// enter Items validation msg

	public static String Alert_order_schedule = "Are you sure,You want to request for scheduled order";
	public static String Alert_order_current = "Are you sure,You want to request for instant order";
	public static String choose_item_type = "Please choose item type";
	public static String choose_item_name = "Please enter item name";
	public static String choose_item_packed_unpacked = "Please choose item is packed or unpacked";
	public static String enter_total_items = "Please enter total items";
	public static String enter_total_itemsmaxten = "Quantity should not be greater than from 10 items";
	public static String enter_total_itemsmaxfive = "Quantity should not be greater than from 5 items";

	public static String enter_item_weight = "Please enter item's weight";
	public static String enter_item_weight_maxten = "Weight should not be greater than from 10 kg";
	public static String enter_item_weight_maxfifty = "Weight should not be greater than from 50 kg";
	public static String enter_item_weight_maxhunderd = "Weight should not be greater than from 100 kg";

	public static String choose_item_breakable_unbreakable = "Please choose item is breakable on unbreakable";
	public static String choose_pickup_date = "Please choose pick up date";
	public static String choose_pickup_time = "Please choose pick up time";
	public static String enter_rec_name = "Please enter name of reciever";
	public static String enter_rec_address = "Please enter address of reciever";
	public static String enter_rec_sector = "Please enter sector/colony of reciever";
	public static String enter_rec_city = "Please enter city name of reciever";
	public static String enter_rec_phone = "Please enter reciever's phone number";
	public static String enter_bill_amount = "Please enter bill amount which you need to collect from customer";
	public static String enter_giftpacking = "Choose if you want Gift packing of item";

//  pickuo  Date time validation checks

	public static String date_null = "Current Date or choosed date is null";
	public static String choose_largedate_from_currentdate = "Can't choose pickup date from past days";
	public static String choose_date_within_threedays = "Please choose pick up date within three days from current date";
	public static String choose_picktime_two_hours_later = "Please choose pick up time 2 hours later from current time";

	//  promo code validation checks msg
	public static String enter_promocode = "Please enter promo code.";
	public static String promocode_valid = "Promo Code Applied";
	public static String promocode_invalid = "Promo Code not Applied";
	public static String promocode_remove = "Promo code removed";

	//  Error on location selection
	public static String error_in_pickup_latlong = "Could not get latitude and longitude.";
}
