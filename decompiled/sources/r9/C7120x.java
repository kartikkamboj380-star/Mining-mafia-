package r9;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: r9.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7120x extends AbstractC7112o {
    private final List r(T t10, boolean z9) throws IOException {
        File file = t10.toFile();
        String[] list = file.list();
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                Intrinsics.c(str);
                arrayList.add(t10.k(str));
            }
            CollectionsKt.u(arrayList);
            return arrayList;
        }
        if (!z9) {
            return null;
        }
        if (file.exists()) {
            throw new IOException("failed to list " + t10);
        }
        throw new FileNotFoundException("no such file: " + t10);
    }

    private final void s(T t10) throws IOException {
        if (j(t10)) {
            throw new IOException(t10 + " already exists.");
        }
    }

    private final void t(T t10) throws IOException {
        if (j(t10)) {
            return;
        }
        throw new IOException(t10 + " doesn't exist.");
    }

    @Override // r9.AbstractC7112o
    public a0 b(T file, boolean z9) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        if (z9) {
            t(file);
        }
        return L.g(file.toFile(), true);
    }

    @Override // r9.AbstractC7112o
    public void c(T source, T target) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        if (source.toFile().renameTo(target.toFile())) {
            return;
        }
        throw new IOException("failed to move " + source + " to " + target);
    }

    @Override // r9.AbstractC7112o
    public void g(T dir, boolean z9) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        if (dir.toFile().mkdir()) {
            return;
        }
        C7111n c7111nM = m(dir);
        if (c7111nM == null || !c7111nM.f()) {
            throw new IOException("failed to create directory: " + dir);
        }
        if (z9) {
            throw new IOException(dir + " already exists.");
        }
    }

    @Override // r9.AbstractC7112o
    public void i(T path, boolean z9) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File file = path.toFile();
        if (file.delete()) {
            return;
        }
        if (file.exists()) {
            throw new IOException("failed to delete " + path);
        }
        if (z9) {
            throw new FileNotFoundException("no such file: " + path);
        }
    }

    @Override // r9.AbstractC7112o
    public List k(T dir) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        List listR = r(dir, true);
        Intrinsics.c(listR);
        return listR;
    }

    @Override // r9.AbstractC7112o
    public C7111n m(T path) {
        Intrinsics.checkNotNullParameter(path, "path");
        File file = path.toFile();
        boolean zIsFile = file.isFile();
        boolean zIsDirectory = file.isDirectory();
        long jLastModified = file.lastModified();
        long length = file.length();
        if (!zIsFile && !zIsDirectory && jLastModified == 0 && length == 0 && !file.exists()) {
            return null;
        }
        return new C7111n(zIsFile, zIsDirectory, null, Long.valueOf(length), null, Long.valueOf(jLastModified), null, null, IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT, null);
    }

    @Override // r9.AbstractC7112o
    public AbstractC7110m n(T file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return new C7119w(false, new RandomAccessFile(file.toFile(), AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ));
    }

    @Override // r9.AbstractC7112o
    public a0 p(T file, boolean z9) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        if (z9) {
            s(file);
        }
        return M.g(file.toFile(), false, 1, null);
    }

    @Override // r9.AbstractC7112o
    public c0 q(T file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return L.k(file.toFile());
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
