package com.bytedance.sdk.component.csi.bob.kq;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import com.unity3d.services.core.di.ServiceProvider;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class kq implements com.bytedance.sdk.component.csi.oq, Cloneable {
    private static volatile com.bytedance.sdk.component.csi.oq rhi;
    private boolean bob;
    private File csi;
    private boolean fou;
    private long kq;
    private int oq;

    public kq(int i10, long j10, File file) {
        this(i10, j10, i10 != 0, j10 != 0, file);
    }

    public static com.bytedance.sdk.component.csi.oq nn() {
        return rhi;
    }

    private static long ubx() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
    }

    @Override // com.bytedance.sdk.component.csi.oq
    public int bob() {
        return 0;
    }

    @Override // com.bytedance.sdk.component.csi.oq
    public boolean csi() {
        return this.bob;
    }

    @Override // com.bytedance.sdk.component.csi.oq
    public boolean dgq() {
        return true;
    }

    @Override // com.bytedance.sdk.component.csi.oq
    public int fou() {
        return 0;
    }

    @Override // com.bytedance.sdk.component.csi.oq
    public long kq() {
        return this.kq;
    }

    @Override // com.bytedance.sdk.component.csi.oq
    public int oq() {
        return this.oq;
    }

    @Override // com.bytedance.sdk.component.csi.oq
    public boolean rhi() {
        return false;
    }

    @Override // com.bytedance.sdk.component.csi.oq
    public boolean rjo() {
        return this.fou;
    }

    @Override // com.bytedance.sdk.component.csi.oq
    public File syt() {
        return this.csi;
    }

    public kq(int i10, long j10, boolean z9, boolean z10, File file) {
        this.kq = j10;
        this.oq = i10;
        this.bob = z9;
        this.fou = z10;
        this.csi = file;
    }

    public static void kq(Context context, com.bytedance.sdk.component.csi.oq oqVar) {
        if (oqVar != null) {
            rhi = oqVar;
        } else {
            rhi = kq(new File(context.getCacheDir(), "image"));
        }
    }

    public static com.bytedance.sdk.component.csi.oq kq(File file) {
        int iMin;
        long jMin;
        file.mkdirs();
        if (rhi == null) {
            iMin = Math.min(Long.valueOf(Runtime.getRuntime().maxMemory()).intValue() / 16, 31457280);
            jMin = Math.min(ubx() / 16, 41943040L);
        } else {
            iMin = Math.min(rhi.oq() / 2, 31457280);
            jMin = Math.min(rhi.kq() / 2, 41943040L);
        }
        return new kq(Math.max(iMin, 26214400), Math.max(jMin, ServiceProvider.HTTP_CACHE_DISK_SIZE), file);
    }
}
