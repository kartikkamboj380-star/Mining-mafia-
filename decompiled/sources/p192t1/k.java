package p192t1;

import android.os.StatFs;
import java.io.File;
import r9.AbstractC7112o;
import r9.T;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {
    public static final long a(AbstractC7112o abstractC7112o, T t10) {
        File file = t10.toFile();
        file.mkdir();
        StatFs statFs = new StatFs(file.getAbsolutePath());
        return statFs.getBlockCountLong() * statFs.getBlockSizeLong();
    }
}
