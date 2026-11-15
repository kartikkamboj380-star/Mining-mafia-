package com.pgl.ssdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes3.dex */
public class al {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile al f41935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f41936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<Integer> f41937c = new ArrayList();

    private al(Context context) {
        this.f41936b = null;
        this.f41936b = context;
    }

    public static al a(Context context) {
        if (f41935a == null) {
            synchronized (al.class) {
                try {
                    if (f41935a == null) {
                        f41935a = new al(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f41935a;
    }

    public int b() {
        Intent intentRegisterReceiver = this.f41936b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            return 0;
        }
        return intentRegisterReceiver.getIntExtra("plugged", 0);
    }

    public int c() {
        Intent intentRegisterReceiver = this.f41936b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            return 0;
        }
        return Math.round(((intentRegisterReceiver.getIntExtra("level", 0) / intentRegisterReceiver.getIntExtra("scale", 0)) * 100.0f) * 10.0f) / 10;
    }

    public synchronized String d() {
        if (this.f41937c.size() <= 0) {
            return "-1";
        }
        List<Integer> list = this.f41937c;
        return String.valueOf(list.get(list.size() - 1).intValue() % UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS);
    }

    public synchronized String e() {
        return new JSONArray((Collection) this.f41937c).toString();
    }

    @SuppressLint({"DefaultLocale"})
    public int f() {
        int iC;
        int iB = 0;
        try {
            synchronized (this) {
                iB = b();
                iC = c();
            }
            return (iB * UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS) + iC;
        } catch (Exception unused) {
            return iB * UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS;
        }
    }

    public void a() {
        int iF = f();
        if (iF == -1) {
            return;
        }
        this.f41937c.add(Integer.valueOf(iF));
        try {
            int size = this.f41937c.size();
            if (size > 20) {
                ArrayList arrayList = new ArrayList(this.f41937c.subList(size - 10, size));
                this.f41937c.clear();
                this.f41937c = arrayList;
            }
        } catch (Throwable unused) {
        }
    }
}
