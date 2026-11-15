package Z2;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f7145a = new e();

    private e() {
    }

    public static final int a(InputStream inputStream) {
        if (inputStream == null) {
            Z1.a.b("HeifExifUtil", "Trying to read Heif Exif from null inputStream -> ignoring");
            return 0;
        }
        try {
            return new p061g0.a(inputStream).c("Orientation", 1);
        } catch (IOException e10) {
            Z1.a.g("HeifExifUtil", "Failed reading Heif Exif orientation -> ignoring", e10);
            return 0;
        }
    }
}
