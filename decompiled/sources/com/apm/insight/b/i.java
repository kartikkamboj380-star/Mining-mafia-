package com.apm.insight.b;

import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.Printer;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f12817a = 5;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static b f12818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f12819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Printer f12820d;

    public interface a {
    }

    static class b implements Printer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        List<Printer> f12821a = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private List<Printer> f12824d = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        List<Printer> f12822b = new ArrayList();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f12825e = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f12823c = false;

        b() {
        }

        @Override // android.util.Printer
        public final void println(String str) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            i.b();
            if (str.charAt(0) == '>' && this.f12823c) {
                for (Printer printer : this.f12822b) {
                    if (!this.f12821a.contains(printer)) {
                        this.f12821a.add(printer);
                    }
                }
                this.f12822b.clear();
                this.f12823c = false;
            }
            if (this.f12821a.size() > i.f12817a) {
                Log.e("LooperPrinterUtils", "wrapper contains too many printer,please check if the useless printer have been removed");
            }
            for (Printer printer2 : this.f12821a) {
                if (printer2 != null) {
                    printer2.println(str);
                }
            }
            str.charAt(0);
            i.b();
        }
    }

    public static void a() {
        if (f12819c) {
            return;
        }
        f12819c = true;
        f12818b = new b();
        Printer printerD = d();
        f12820d = printerD;
        if (printerD != null) {
            f12818b.f12821a.add(printerD);
        }
        if (com.apm.insight.e.s()) {
            Looper.getMainLooper().setMessageLogging(f12818b);
        }
    }

    static /* synthetic */ a b() {
        return null;
    }

    private static Printer d() {
        try {
            Field declaredField = Class.forName("android.os.Looper").getDeclaredField("mLogging");
            declaredField.setAccessible(true);
            return (Printer) declaredField.get(Looper.getMainLooper());
        } catch (Exception unused) {
            return null;
        }
    }

    public static void a(Printer printer) {
        if (printer == null || f12818b.f12822b.contains(printer)) {
            return;
        }
        f12818b.f12822b.add(printer);
        f12818b.f12823c = true;
    }
}
