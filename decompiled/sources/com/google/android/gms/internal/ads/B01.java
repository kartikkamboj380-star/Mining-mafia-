package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class B01 extends C2817a9 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC5931yu0 f17449c;

    public B01(String str, Uri uri, List list) {
        super(str, null, false, 1);
        this.f17449c = AbstractC5931yu0.u(list);
    }

    @Override // com.google.android.gms.internal.ads.C2817a9, java.lang.Throwable
    public final String getMessage() {
        AbstractC5931yu0 abstractC5931yu0 = this.f17449c;
        String message = super.getMessage();
        if (abstractC5931yu0.isEmpty()) {
            return message;
        }
        int length = message.length();
        String strValueOf = String.valueOf(abstractC5931yu0);
        StringBuilder sb = new StringBuilder(length + 17 + strValueOf.length());
        sb.append(message);
        sb.append("\nsniff failures: ");
        sb.append(strValueOf);
        return sb.toString();
    }
}
