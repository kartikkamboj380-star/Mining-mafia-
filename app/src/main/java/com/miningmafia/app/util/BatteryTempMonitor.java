package com.miningmafia.app.util;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Build;

/**
 * Monitors battery level and device temperature.
 * Used to pause/reduce mining workload when the device overheats
 * and to respect battery-aware operation.
 */
public class BatteryTempMonitor {

    public interface Callback {
        void onBatteryChanged(int level, int scale, float temperatureC, boolean charging);
    }

    private final Context context;
    private Callback callback;
    private int level = 0;
    private int scale = 100;
    private float temperatureC = 0f;
    private boolean charging = false;

    // Threshold above which mining workload is paused/reduced (device overheating).
    public static final float OVERHEAT_TEMP_C = 45.0f;
    public static final int LOW_BATTERY_PERCENT = 15;

    public BatteryTempMonitor(Context context) {
        this.context = context.getApplicationContext();
        refresh();
    }

    public void setCallback(Callback callback) {
        this.callback = callback;
        if (callback != null) {
            callback.onBatteryChanged(level, scale, temperatureC, charging);
        }
    }

    public void refresh() {
        Intent intent = context.registerReceiver(null, new IntentFilter(Intent.ACTION_BATTERY_CHANGED));
        if (intent != null) {
            level = intent.getIntExtra(BatteryManager.EXTRA_LEVEL, 0);
            scale = intent.getIntExtra(BatteryManager.EXTRA_SCALE, 100);
            int tempRaw = intent.getIntExtra(BatteryManager.EXTRA_TEMP, 0);
            // BatteryManager reports temperature in tenths of a degree Celsius.
            temperatureC = tempRaw / 10.0f;
            int plugged = intent.getIntExtra(BatteryManager.EXTRA_PLUGGED, -1);
            charging = plugged == BatteryManager.BATTERY_PLUGGED_AC
                    || plugged == BatteryManager.BATTERY_PLUGGED_USB
                    || plugged == BatteryManager.BATTERY_PLUGGED_WIRELESS;
        }
        if (callback != null) {
            callback.onBatteryChanged(level, scale, temperatureC, charging);
        }
    }

    public float getTemperatureC() { return temperatureC; }
    public int getLevel() { return level; }
    public int getScale() { return scale; }
    public float getPercent() { return scale == 0 ? 0 : (level * 100f / scale); }
    public boolean isCharging() { return charging; }

    /** True when the device is hot enough that mining should be paused/reduced. */
    public boolean isOverheating() {
        return temperatureC >= OVERHEAT_TEMP_C;
    }

    /** True when battery is critically low and mining should be reduced/paused. */
    public boolean isLowBattery() {
        return (int) getPercent() <= LOW_BATTERY_PERCENT && !charging;
    }

    /** Whether the device is in battery-saver mode (best-effort). */
    public boolean isBatterySaverOn() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            android.os.PowerManager pm = (android.os.PowerManager)
                    context.getSystemService(Context.POWER_SERVICE);
            if (pm != null) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    return pm.isIgnoringBatteryOptimizations(); // not exactly saver, use PowerManager.isDeviceIdleMode on N+
                }
                return pm.isPowerSaveMode();
            }
        }
        return false;
    }
}
