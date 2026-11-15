package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ni, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4521ni {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f31872d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Context f31873e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    String f31874f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private AtomicBoolean f31876h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private File f31877i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final BlockingQueue f31869a = new ArrayBlockingQueue(100);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final LinkedHashMap f31870b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Map f31871c = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashSet f31875g = new HashSet(Arrays.asList("noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"));

    private final void g(Map map, C5654wi c5654wi) throws Throwable {
        Uri.Builder builderBuildUpon = Uri.parse(this.f31872d).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        String string = builderBuildUpon.build().toString();
        if (c5654wi != null) {
            StringBuilder sb = new StringBuilder(string);
            if (!TextUtils.isEmpty(c5654wi.a())) {
                sb.append("&it=");
                sb.append(c5654wi.a());
            }
            if (!TextUtils.isEmpty(c5654wi.b())) {
                sb.append("&blat=");
                sb.append(c5654wi.b());
            }
            string = sb.toString();
        }
        if (!this.f31876h.get()) {
            G4.t.g();
            K4.F0.q(this.f31873e, this.f31874f, string);
            return;
        }
        File file = this.f31877i;
        if (file == null) {
            int i10 = AbstractC0786o0.f2696b;
            L4.p.f("CsiReporter: File doesn't exist. Cannot write CSI data to file.");
            return;
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, true);
                try {
                    fileOutputStream2.write(string.getBytes());
                    fileOutputStream2.write(10);
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e10) {
                        int i11 = AbstractC0786o0.f2696b;
                        L4.p.g("CsiReporter: Cannot close file: sdk_csi_data.txt.", e10);
                    }
                } catch (IOException e11) {
                    e = e11;
                    fileOutputStream = fileOutputStream2;
                    int i12 = AbstractC0786o0.f2696b;
                    L4.p.g("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e12) {
                            L4.p.g("CsiReporter: Cannot close file: sdk_csi_data.txt.", e12);
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e13) {
                            int i13 = AbstractC0786o0.f2696b;
                            L4.p.g("CsiReporter: Cannot close file: sdk_csi_data.txt.", e13);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e14) {
            e = e14;
        }
    }

    public final void a(Context context, String str, String str2, Map map) {
        File externalStorageDirectory;
        this.f31873e = context;
        this.f31874f = str;
        this.f31872d = str2;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f31876h = atomicBoolean;
        atomicBoolean.set(((Boolean) AbstractC3391ej.f28054c.e()).booleanValue());
        if (this.f31876h.get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            this.f31877i = new File(AbstractC2035Li0.a().a(externalStorageDirectory, "sdk_csi_data.txt"));
        }
        for (Map.Entry entry : map.entrySet()) {
            this.f31870b.put((String) entry.getKey(), (String) entry.getValue());
        }
        AbstractC2315Qt.f22473a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.mi
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() throws Throwable {
                this.f31569a.f();
            }
        });
        Map map2 = this.f31871c;
        AbstractC5276ti abstractC5276ti = AbstractC5276ti.f33459b;
        map2.put(HandleInvocationsFromAdViewer.KEY_ACTION, abstractC5276ti);
        map2.put("ad_format", abstractC5276ti);
        map2.put("e", AbstractC5276ti.f33460c);
    }

    public final boolean b(C5780xi c5780xi) {
        return this.f31869a.offer(c5780xi);
    }

    final Map c(Map map, Map map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (Map.Entry entry : map2.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            linkedHashMap.put(str, d(str).a((String) linkedHashMap.get(str), str2));
        }
        return linkedHashMap;
    }

    public final AbstractC5276ti d(String str) {
        AbstractC5276ti abstractC5276ti = (AbstractC5276ti) this.f31871c.get(str);
        return abstractC5276ti != null ? abstractC5276ti : AbstractC5276ti.f33458a;
    }

    public final void e(String str) throws Throwable {
        if (this.f31875g.contains(str)) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("sdkVersion", this.f31874f);
        linkedHashMap.put("ue", str);
        g(c(this.f31870b, linkedHashMap), null);
    }

    final /* synthetic */ void f() throws Throwable {
        while (true) {
            try {
                C5780xi c5780xi = (C5780xi) this.f31869a.take();
                C5654wi c5654wiC = c5780xi.c();
                if (!TextUtils.isEmpty(c5654wiC.a())) {
                    g(c(this.f31870b, c5780xi.e()), c5654wiC);
                }
            } catch (InterruptedException e10) {
                int i10 = AbstractC0786o0.f2696b;
                L4.p.g("CsiReporter:reporter interrupted", e10);
                return;
            }
        }
    }
}
