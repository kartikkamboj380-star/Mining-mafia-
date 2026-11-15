package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.SystemClock;
import com.google.android.gms.common.internal.Asserts;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes2.dex */
final class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uri f17114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Bitmap f17115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CountDownLatch f17116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ ImageManager f17117d;

    public c(ImageManager imageManager, Uri uri, Bitmap bitmap, boolean z9, CountDownLatch countDownLatch) {
        this.f17117d = imageManager;
        this.f17114a = uri;
        this.f17115b = bitmap;
        this.f17116c = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Asserts.checkMainThread("OnBitmapLoadedRunnable must be executed in the main thread");
        ImageManager.ImageReceiver imageReceiver = (ImageManager.ImageReceiver) this.f17117d.zai.remove(this.f17114a);
        if (imageReceiver != null) {
            ArrayList arrayList = imageReceiver.f17107b;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                zag zagVar = (zag) arrayList.get(i10);
                Bitmap bitmap = this.f17115b;
                if (bitmap != null) {
                    zagVar.zac(this.f17117d.zad, bitmap, false);
                } else {
                    this.f17117d.zaj.put(this.f17114a, Long.valueOf(SystemClock.elapsedRealtime()));
                    ImageManager imageManager = this.f17117d;
                    zagVar.zab(imageManager.zad, imageManager.zag, false);
                }
                if (!(zagVar instanceof zaf)) {
                    this.f17117d.zah.remove(zagVar);
                }
            }
        }
        this.f17116c.countDown();
        synchronized (ImageManager.zaa) {
            ImageManager.zab.remove(this.f17114a);
        }
    }
}
