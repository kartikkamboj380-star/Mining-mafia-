package com.google.firebase.analytics.connector.internal;

import Y5.j;
import Y5.l;
import android.os.Bundle;
import p136n5.y;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final l f39978a = l.r("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final j f39979b = j.r("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final j f39980c = j.q("auto", "app", "am");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final j f39981d = j.p("_r", "_dbg");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final j f39982e = new j.a().e(y.f46909a).e(y.f46910b).f();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final j f39983f = j.p("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f39984g = 0;

    public static boolean a(String str) {
        return !f39980c.contains(str);
    }

    public static boolean b(String str, Bundle bundle) {
        if (f39979b.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        j jVar = f39981d;
        int size = jVar.size();
        int i10 = 0;
        while (i10 < size) {
            boolean zContainsKey = bundle.containsKey((String) jVar.get(i10));
            i10++;
            if (zContainsKey) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(String str) {
        return !f39978a.contains(str);
    }

    public static boolean d(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals("fcm") || str.equals("frc");
        }
        if ("_ln".equals(str2)) {
            return str.equals("fcm") || str.equals("fiam");
        }
        if (f39982e.contains(str2)) {
            return false;
        }
        j jVar = f39983f;
        int size = jVar.size();
        int i10 = 0;
        while (i10 < size) {
            boolean zMatches = str2.matches((String) jVar.get(i10));
            i10++;
            if (zMatches) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0060  */
    public static boolean e(String str, String str2, Bundle bundle) {
        byte b10;
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!a(str) || bundle == null) {
            return false;
        }
        j jVar = f39981d;
        int size = jVar.size();
        int i10 = 0;
        while (i10 < size) {
            boolean zContainsKey = bundle.containsKey((String) jVar.get(i10));
            i10++;
            if (zContainsKey) {
                return false;
            }
        }
        int iHashCode = str.hashCode();
        if (iHashCode != 101200) {
            if (iHashCode != 101230) {
                if (iHashCode == 3142703 && str.equals("fiam")) {
                    b10 = 2;
                } else {
                    b10 = -1;
                }
            } else if (str.equals("fdl")) {
                b10 = 1;
            } else {
                b10 = -1;
            }
        } else if (str.equals("fcm")) {
            b10 = 0;
        } else {
            b10 = -1;
        }
        if (b10 == 0) {
            bundle.putString("_cis", "fcm_integration");
            return true;
        }
        if (b10 == 1) {
            bundle.putString("_cis", "fdl_integration");
            return true;
        }
        if (b10 != 2) {
            return false;
        }
        bundle.putString("_cis", "fiam_integration");
        return true;
    }
}
