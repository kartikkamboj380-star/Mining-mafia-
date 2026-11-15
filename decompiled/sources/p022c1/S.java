package p022c1;

import android.content.res.AssetFileDescriptor;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;
import p132n1.o;
import r9.AbstractC7112o;
import r9.T;

/* JADX INFO: loaded from: classes.dex */
public abstract class S {
    public static final ImageDecoder.Source b(w wVar, o oVar, boolean z9) {
        T tZ0;
        if (wVar.getFileSystem() == AbstractC7112o.f48491b && (tZ0 = wVar.Z0()) != null) {
            return ImageDecoder.createSource(tZ0.toFile());
        }
        w.a metadata = wVar.getMetadata();
        if (metadata instanceof C1195a) {
            return ImageDecoder.createSource(oVar.c().getAssets(), ((C1195a) metadata).a());
        }
        if ((metadata instanceof C1203i) && Build.VERSION.SDK_INT >= 29) {
            try {
                final AssetFileDescriptor assetFileDescriptorA = ((C1203i) metadata).a();
                Os.lseek(assetFileDescriptorA.getFileDescriptor(), assetFileDescriptorA.getStartOffset(), OsConstants.SEEK_SET);
                return ImageDecoder.createSource((Callable<AssetFileDescriptor>) new Callable() { // from class: c1.Q
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return S.c(assetFileDescriptorA);
                    }
                });
            } catch (ErrnoException unused) {
                return null;
            }
        }
        if (metadata instanceof y) {
            y yVar = (y) metadata;
            if (Intrinsics.b(yVar.a(), oVar.c().getPackageName())) {
                return ImageDecoder.createSource(oVar.c().getResources(), yVar.b());
            }
        }
        if (!(metadata instanceof C1202h)) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 30 || !z9 || ((C1202h) metadata).a().isDirect()) {
            return ImageDecoder.createSource(((C1202h) metadata).a());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AssetFileDescriptor c(AssetFileDescriptor assetFileDescriptor) {
        return assetFileDescriptor;
    }
}
