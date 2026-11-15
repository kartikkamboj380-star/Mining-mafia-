package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract;
import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Rp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2359Rp extends C2903aq {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f22921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f22922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f22923e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f22924f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f22925g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f22926h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f22927i;

    public C2359Rp(InterfaceC1750Fw interfaceC1750Fw, Map map) {
        super(interfaceC1750Fw, "createCalendarEvent");
        this.f22921c = map;
        this.f22922d = interfaceC1750Fw.d();
        this.f22923e = k("description");
        this.f22926h = k("summary");
        this.f22924f = l("start_ticks");
        this.f22925g = l("end_ticks");
        this.f22927i = k("location");
    }

    private final String k(String str) {
        Map map = this.f22921c;
        return TextUtils.isEmpty((CharSequence) map.get(str)) ? "" : (String) map.get(str);
    }

    private final long l(String str) {
        String str2 = (String) this.f22921c.get(str);
        if (str2 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public final void h() {
        Context context = this.f22922d;
        if (context == null) {
            b("Activity context is not available.");
            return;
        }
        G4.t.g();
        if (!new C2239Ph(context).b()) {
            b("This feature is not available on the device.");
            return;
        }
        G4.t.g();
        AlertDialog.Builder builderP = K4.F0.p(context);
        Resources resourcesI = G4.t.l().i();
        builderP.setTitle(resourcesI != null ? resourcesI.getString(F4.d.f733r) : "Create calendar event");
        builderP.setMessage(resourcesI != null ? resourcesI.getString(F4.d.f734s) : "Allow Ad to create a calendar event?");
        builderP.setPositiveButton(resourcesI != null ? resourcesI.getString(F4.d.f731p) : "Accept", new DialogInterfaceOnClickListenerC2255Pp(this));
        builderP.setNegativeButton(resourcesI != null ? resourcesI.getString(F4.d.f732q) : "Decline", new DialogInterfaceOnClickListenerC2307Qp(this));
        builderP.create().show();
    }

    final Intent i() {
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra("title", this.f22923e);
        data.putExtra("eventLocation", this.f22927i);
        data.putExtra("description", this.f22926h);
        long j10 = this.f22924f;
        if (j10 > -1) {
            data.putExtra("beginTime", j10);
        }
        long j11 = this.f22925g;
        if (j11 > -1) {
            data.putExtra("endTime", j11);
        }
        data.setFlags(268435456);
        return data;
    }

    final /* synthetic */ Context j() {
        return this.f22922d;
    }
}
