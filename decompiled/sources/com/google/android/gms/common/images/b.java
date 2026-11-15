package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.SystemClock;
import com.google.android.gms.common.images.ImageManager.ImageReceiver;
import com.google.android.gms.common.internal.Asserts;

/* JADX INFO: loaded from: classes2.dex */
final class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zag f17112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ImageManager f17113b;

    public b(ImageManager imageManager, zag zagVar) {
        this.f17113b = imageManager;
        this.f17112a = zagVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Asserts.checkMainThread("LoadImageRunnable must be executed on the main thread");
        ImageManager.ImageReceiver imageReceiver = (ImageManager.ImageReceiver) this.f17113b.zah.get(this.f17112a);
        if (imageReceiver != null) {
            ImageManager imageManager = this.f17113b;
            imageManager.zah.remove(this.f17112a);
            imageReceiver.c(this.f17112a);
        }
        zag zagVar = this.f17112a;
        d dVar = zagVar.zaa;
        Uri uri = dVar.f17118a;
        if (uri == null) {
            ImageManager imageManager2 = this.f17113b;
            zagVar.zab(imageManager2.zad, imageManager2.zag, true);
            return;
        }
        Long l10 = (Long) this.f17113b.zaj.get(uri);
        if (l10 != null) {
            if (SystemClock.elapsedRealtime() - l10.longValue() < 3600000) {
                zag zagVar2 = this.f17112a;
                ImageManager imageManager3 = this.f17113b;
                zagVar2.zab(imageManager3.zad, imageManager3.zag, true);
                return;
            } else {
                ImageManager imageManager4 = this.f17113b;
                imageManager4.zaj.remove(dVar.f17118a);
            }
        }
        this.f17112a.zaa(null, false, true, false);
        ImageManager imageManager5 = this.f17113b;
        ImageManager.ImageReceiver imageReceiver2 = (ImageManager.ImageReceiver) imageManager5.zai.get(dVar.f17118a);
        if (imageReceiver2 == null) {
            ImageManager.ImageReceiver imageReceiver3 = this.f17113b.new ImageReceiver(dVar.f17118a);
            ImageManager imageManager6 = this.f17113b;
            imageManager6.zai.put(dVar.f17118a, imageReceiver3);
            imageReceiver2 = imageReceiver3;
        }
        imageReceiver2.b(this.f17112a);
        zag zagVar3 = this.f17112a;
        if (!(zagVar3 instanceof zaf)) {
            this.f17113b.zah.put(zagVar3, imageReceiver2);
        }
        synchronized (ImageManager.zaa) {
            try {
                if (!ImageManager.zab.contains(dVar.f17118a)) {
                    ImageManager.zab.add(dVar.f17118a);
                    imageReceiver2.d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
