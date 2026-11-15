package com.google.android.gms.internal.ads;

import com.reactnativecommunity.clipboard.ClipboardModule;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
abstract class I4 {
    public static String a(List list) {
        Iterator it = list.iterator();
        String str = null;
        boolean z9 = false;
        while (it.hasNext()) {
            String str2 = ((X4) it.next()).f25129a.f23906g.f19929o;
            if (A8.b(str2)) {
                return "video/mp4";
            }
            if (A8.a(str2)) {
                z9 = true;
            } else if (A8.c(str2)) {
                if (Objects.equals(str2, ClipboardModule.MIMETYPE_HEIC)) {
                    str = ClipboardModule.MIMETYPE_HEIF;
                } else if (Objects.equals(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        if (z9) {
            return "audio/mp4";
        }
        return str != null ? str : "application/mp4";
    }
}
