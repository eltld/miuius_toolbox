/**
 * This class will be added to framework.jar and used for convenience in
 * other packages as needed. 
 */
package us.miui;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import android.provider.Settings.SettingNotFoundException;

/**
 * @author Clark Scheff
 *
 */
public class Toolbox {
	// Strings for retreiving settings using Settings.System.getXXXX
	public final static String CENTER_CLOCK = "center_clock";
	public final static String SINGLE_SIGNAL_BARS = "single_signal_bars";
	public final static String USE_CUSTOM_CARRIER = "use_custom_carrier";
	public final static String CUSTOM_CARRIER_TEXT = "custom_carrier_text";
	public final static String HIDE_STATUS_BAR = "hide_status_bar";
	public final static String ALLOW_LAUNCHER_ROTATION = "allow_launcher_rotation";
	public final static String CUSTOM_CLOCK_COLOR = "custom_clock_color";
	public final static String CUSTOM_CARRIER_COLOR = "custom_carrier_color";
	public final static String CUSTOM_SIGNAL_COLOR = "custom_signal_color";
	public final static String CUSTOM_NAVBAR_COLOR = "custom_navbar_color";
	public final static String CUSTOM_BATTERY_COLOR = "custom_battery_color";

	/**
	 * Retrieves the system setting for CENTER_CLOCK
	 * @param context context used to get a ContentResolver
	 * @return true if center clock is to be used, false otherwise
	 */
	public static boolean useCenterClock(Context context) {
		boolean use = false;
		ContentResolver cr = context.getContentResolver();
		
		try {
			use = (Settings.System.getInt(cr,
					CENTER_CLOCK) == 1);
		} catch (SettingNotFoundException e) {
			use = false;
		}
		
		return use;
	}

	/**
	 * Retrieves the system setting for SINGLE_SIGNAL_BARS
	 * @param context context used to get a ContentResolver
	 * @return true if single bars are to be used, false otherwise
	 */
	public static boolean useSingleBars(Context context) {
		boolean use = false;
		ContentResolver cr = context.getContentResolver();
		
		try {
			use = (Settings.System.getInt(cr,
					SINGLE_SIGNAL_BARS) == 1);
		} catch (SettingNotFoundException e) {
			use = false;
		}
		
		return use;
	}
	
	/**
	 * Retrieves the system setting for USE_CUSTOM_CARRIER
	 * @param context context used to get a ContentResolver
	 * @return true if custom carrier text is to be used, false otherwise
	 */
	public static boolean useCustomCarrierText(Context context) {
		boolean use = false;
		ContentResolver cr = context.getContentResolver();
		
		try {
			use = (Settings.System.getInt(cr,
					USE_CUSTOM_CARRIER) == 1);
		} catch (SettingNotFoundException e) {
			use = false;
		}
		
		return use;
	}
	
	/**
	 * Retrieves the text to use for custom carrier from system settings
	 * @param context context used to get a ContentResolver
	 * @return the text to use for the carrier label
	 */
	public static String getCustomCarrierText(Context context) {
		String text = "";
		ContentResolver cr = context.getContentResolver();
		
		text = Settings.System.getString(cr,
				CUSTOM_CARRIER_TEXT);
		if (text == null)
			text = "";
		
		return text;
	}

	/**
	 * Retrieves the system setting for HIDE_STATUS_BAR
	 * @param context context used to get a ContentResolver
	 * @return true if status bar is to be hidden in MiuiHome
	 */
	public static boolean hideStatusBar(Context context) {
		boolean hide = false;
		ContentResolver cr = context.getContentResolver();
		
		try {
			hide = (Settings.System.getInt(cr,
					HIDE_STATUS_BAR) == 1);
		} catch (SettingNotFoundException e) {
			hide = false;
		}
		
		return hide;
	}

	/**
	 * Retrieves the system setting for ALLOW_LAUNCHER_ROTATION
	 * @param context context used to get a ContentResolver
	 * @return true if launcher should rotate into landscape orientation
	 */
	public static boolean rotateMiuiHome(Context context) {
		boolean hide = false;
		ContentResolver cr = context.getContentResolver();
		
		try {
			hide = (Settings.System.getInt(cr,
					ALLOW_LAUNCHER_ROTATION) == 1);
		} catch (SettingNotFoundException e) {
			hide = false;
		}
		
		return hide;
	}

	/**
	 * Retrieves the system setting for CUSTOM_CLOCK_COLOR
	 * @param context context used to get a ContentResolver
	 * @return true if a custom clock color has been selected
	 */
	public static boolean useCustomClockColor(Context context) {
		boolean use = false;
		ContentResolver cr = context.getContentResolver();
		
		try {
			Settings.System.getInt(cr,
					CUSTOM_CLOCK_COLOR);
			use = true;
		} catch (SettingNotFoundException e) {
			use = false;
		}
		
		return use;
	}

	/**
	 * Retrieves the custom color selected for CUSTOM_CLOCK_COLOR
	 * @param context context used to get a ContentResolver
	 * @return the ARGB color selected by the user
	 */
	public static int getCustomClockColor(Context context) {
		int color = 0xFFFFFFFF;
		ContentResolver cr = context.getContentResolver();
		
		try {
			color = Settings.System.getInt(cr,
					CUSTOM_CLOCK_COLOR);
		} catch (SettingNotFoundException e) {
			color = 0xFFFFFFFF;
		}
		
		return color;
	}

	/**
	 * Retrieves the system setting for CUSTOM_CARRIER_COLOR
	 * @param context context used to get a ContentResolver
	 * @return true if a custom carrier color has been selected
	 */
	public static boolean useCustomCarrierColor(Context context) {
		boolean use = false;
		ContentResolver cr = context.getContentResolver();
		
		try {
			Settings.System.getInt(cr,
					CUSTOM_CARRIER_COLOR);
			use = true;
		} catch (SettingNotFoundException e) {
			use = false;
		}
		
		return use;
	}

	/**
	 * Retrieves the custom color selected for CUSTOM_CARRIER_COLOR
	 * @param context context used to get a ContentResolver
	 * @return the ARGB color selected by the user
	 */
	public static int getCustomCarrierColor(Context context) {
		int color = 0xFFFFFFFF;
		ContentResolver cr = context.getContentResolver();
		
		try {
			color = Settings.System.getInt(cr,
					CUSTOM_CARRIER_COLOR);
		} catch (SettingNotFoundException e) {
			color = 0xFFFFFFFF;
		}
		
		return color;
	}

	/**
	 * Retrieves the system setting for CUSTOM_SIGNAL_COLOR
	 * @param context context used to get a ContentResolver
	 * @return true if a custom signal color has been selected
	 */
	public static boolean useCustomSignalColor(Context context) {
		boolean use = false;
		ContentResolver cr = context.getContentResolver();
		
		try {
			Settings.System.getInt(cr,
					CUSTOM_SIGNAL_COLOR);
			use = true;
		} catch (SettingNotFoundException e) {
			use = false;
		}
		
		return use;
	}

	/**
	 * Retrieves the custom color selected for CUSTOM_SIGNAL_COLOR
	 * @param context context used to get a ContentResolver
	 * @return the ARGB color selected by the user
	 */
	public static int getCustomSignalColor(Context context) {
		int color = 0xFFFFFFFF;
		ContentResolver cr = context.getContentResolver();
		
		try {
			color = Settings.System.getInt(cr,
					CUSTOM_SIGNAL_COLOR);
		} catch (SettingNotFoundException e) {
			color = 0xFFFFFFFF;
		}
		
		return color;
	}

	/**
	 * Retrieves the system setting for CUSTOM_NAVBAR_COLOR
	 * @param context context used to get a ContentResolver
	 * @return true if a custom navbar color has been selected
	 */
	public static boolean useCustomNavbarColor(Context context) {
		boolean use = false;
		ContentResolver cr = context.getContentResolver();
		
		try {
			Settings.System.getInt(cr,
					CUSTOM_NAVBAR_COLOR);
			use = true;
		} catch (SettingNotFoundException e) {
			use = false;
		}
		
		return use;
	}

	/**
	 * Retrieves the custom color selected for CUSTOM_NAVBAR_COLOR
	 * @param context context used to get a ContentResolver
	 * @return the ARGB color selected by the user
	 */
	public static int getCustomNavbarColor(Context context) {
		int color = 0xFFFFFFFF;
		ContentResolver cr = context.getContentResolver();
		
		try {
			color = Settings.System.getInt(cr,
					CUSTOM_NAVBAR_COLOR);
		} catch (SettingNotFoundException e) {
			color = 0xFFFFFFFF;
		}
		
		return color;
	}

	/**
	 * Retrieves the system setting for CUSTOM_BATTERY_COLOR
	 * @param context context used to get a ContentResolver
	 * @return true if a custom battery color has been selected
	 */
	public static boolean useCustomBatteryColor(Context context) {
		boolean use = false;
		ContentResolver cr = context.getContentResolver();
		
		try {
			Settings.System.getInt(cr,
					CUSTOM_BATTERY_COLOR);
			use = true;
		} catch (SettingNotFoundException e) {
			use = false;
		}
		
		return use;
	}

	/**
	 * Retrieves the custom color selected for CUSTOM_BATTERY_COLOR
	 * @param context context used to get a ContentResolver
	 * @return the ARGB color selected by the user
	 */
	public static int getCustomBatteryColor(Context context) {
		int color = 0xFFFFFFFF;
		ContentResolver cr = context.getContentResolver();
		
		try {
			color = Settings.System.getInt(cr,
					CUSTOM_BATTERY_COLOR);
		} catch (SettingNotFoundException e) {
			color = 0xFFFFFFFF;
		}
		
		return color;
	}
}
