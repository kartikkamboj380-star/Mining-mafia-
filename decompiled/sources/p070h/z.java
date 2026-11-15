package p070h;

import C.f;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
class z {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static z f44727d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f44728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LocationManager f44729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f44730c = new a();

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f44731a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f44732b;

        a() {
        }
    }

    z(Context context, LocationManager locationManager) {
        this.f44728a = context;
        this.f44729b = locationManager;
    }

    static z a(Context context) {
        if (f44727d == null) {
            Context applicationContext = context.getApplicationContext();
            f44727d = new z(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f44727d;
    }

    private Location b() {
        Location locationC = f.b(this.f44728a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        Location locationC2 = f.b(this.f44728a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? c("gps") : null;
        if (locationC2 == null || locationC == null) {
            return locationC2 != null ? locationC2 : locationC;
        }
        return locationC2.getTime() > locationC.getTime() ? locationC2 : locationC;
    }

    private Location c(String str) {
        try {
            if (this.f44729b.isProviderEnabled(str)) {
                return this.f44729b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e10) {
            Log.d("TwilightManager", "Failed to get last known location", e10);
            return null;
        }
    }

    private boolean e() {
        return this.f44730c.f44732b > System.currentTimeMillis();
    }

    private void f(Location location) {
        long j10;
        a aVar = this.f44730c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        y yVarB = y.b();
        yVarB.a(jCurrentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        yVarB.a(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z9 = yVarB.f44726c == 1;
        long j11 = yVarB.f44725b;
        long j12 = yVarB.f44724a;
        yVarB.a(jCurrentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
        long j13 = yVarB.f44725b;
        if (j11 == -1 || j12 == -1) {
            j10 = jCurrentTimeMillis + 43200000;
        } else {
            if (jCurrentTimeMillis > j12) {
                j11 = j13;
            } else if (jCurrentTimeMillis > j11) {
                j11 = j12;
            }
            j10 = j11 + 60000;
        }
        aVar.f44731a = z9;
        aVar.f44732b = j10;
    }

    boolean d() {
        a aVar = this.f44730c;
        if (e()) {
            return aVar.f44731a;
        }
        Location locationB = b();
        if (locationB != null) {
            f(locationB);
            return aVar.f44731a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i10 = Calendar.getInstance().get(11);
        return i10 < 6 || i10 >= 22;
    }
}
