package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.eO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3349eO {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final K4.N f27770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Clock f27771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f27772c;

    public C3349eO(K4.N n10, Clock clock, Executor executor) {
        this.f27770a = n10;
        this.f27771b = clock;
        this.f27772c = executor;
    }

    private final Bitmap c(byte[] bArr, BitmapFactory.Options options) {
        Clock clock = this.f27771b;
        long jElapsedRealtime = clock.elapsedRealtime();
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        long jElapsedRealtime2 = clock.elapsedRealtime();
        if (bitmapDecodeByteArray != null) {
            long j10 = jElapsedRealtime2 - jElapsedRealtime;
            int width = bitmapDecodeByteArray.getWidth();
            int height = bitmapDecodeByteArray.getHeight();
            int allocationByteCount = bitmapDecodeByteArray.getAllocationByteCount();
            boolean z9 = Looper.getMainLooper().getThread() == Thread.currentThread();
            StringBuilder sb = new StringBuilder(String.valueOf(width).length() + 20 + String.valueOf(height).length() + 8 + String.valueOf(allocationByteCount).length() + 7 + String.valueOf(j10).length() + 15 + String.valueOf(z9).length());
            sb.append("Decoded image w: ");
            sb.append(width);
            sb.append(" h:");
            sb.append(height);
            sb.append(" bytes: ");
            sb.append(allocationByteCount);
            sb.append(" time: ");
            sb.append(j10);
            sb.append(" on ui thread: ");
            sb.append(z9);
            AbstractC0786o0.k(sb.toString());
        }
        return bitmapDecodeByteArray;
    }

    public final com.google.common.util.concurrent.p a(String str, final double d10, final boolean z9) {
        return AbstractC5685wx0.k(this.f27770a.a(str), new InterfaceC1899Is0() { // from class: com.google.android.gms.internal.ads.dO
            @Override // com.google.android.gms.internal.ads.InterfaceC1899Is0
            public final /* synthetic */ Object apply(Object obj) {
                return this.f27406a.b(d10, z9, (C5456v8) obj);
            }
        }, this.f27772c);
    }

    final /* synthetic */ Bitmap b(double d10, boolean z9, C5456v8 c5456v8) {
        byte[] bArr = c5456v8.f33999b;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = (int) (d10 * 160.0d);
        if (!z9) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29789c7)).booleanValue()) {
            options.inJustDecodeBounds = true;
            c(bArr, options);
            options.inJustDecodeBounds = false;
            int i10 = options.outWidth * options.outHeight;
            if (i10 > 0) {
                options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros((i10 - 1) / ((Integer) H4.B.c().d(AbstractC3892ii.f29800d7)).intValue())) / 2);
            }
        }
        return c(bArr, options);
    }
}
