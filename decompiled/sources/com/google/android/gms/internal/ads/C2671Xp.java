package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Xp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2671Xp extends C2903aq {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f25392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f25393d;

    public C2671Xp(InterfaceC1750Fw interfaceC1750Fw, Map map) {
        super(interfaceC1750Fw, "storePicture");
        this.f25392c = map;
        this.f25393d = interfaceC1750Fw.d();
    }

    public final void h() {
        Context context = this.f25393d;
        if (context == null) {
            b("Activity context is not available");
            return;
        }
        G4.t.g();
        if (!new C2239Ph(context).a()) {
            b("Feature is not supported by the device.");
            return;
        }
        String str = (String) this.f25392c.get("iurl");
        if (TextUtils.isEmpty(str)) {
            b("Image url cannot be empty.");
            return;
        }
        if (!URLUtil.isValidUrl(str)) {
            b("Invalid image url: ".concat(String.valueOf(str)));
            return;
        }
        String lastPathSegment = Uri.parse(str).getLastPathSegment();
        G4.t.g();
        if (TextUtils.isEmpty(lastPathSegment) || !lastPathSegment.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)")) {
            b("Image type not recognized: ".concat(String.valueOf(lastPathSegment)));
            return;
        }
        Resources resourcesI = G4.t.l().i();
        G4.t.g();
        AlertDialog.Builder builderP = K4.F0.p(context);
        builderP.setTitle(resourcesI != null ? resourcesI.getString(F4.d.f729n) : "Save image");
        builderP.setMessage(resourcesI != null ? resourcesI.getString(F4.d.f730o) : "Allow Ad to store image in Picture gallery?");
        builderP.setPositiveButton(resourcesI != null ? resourcesI.getString(F4.d.f731p) : "Accept", new DialogInterfaceOnClickListenerC2567Vp(this, str, lastPathSegment));
        builderP.setNegativeButton(resourcesI != null ? resourcesI.getString(F4.d.f732q) : "Decline", new DialogInterfaceOnClickListenerC2619Wp(this));
        builderP.create().show();
    }

    final /* synthetic */ Context i() {
        return this.f25393d;
    }
}
