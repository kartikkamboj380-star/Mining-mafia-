package W;

import android.os.ParcelFileDescriptor;
import androidx.datastore.core.NativeSharedCounter;
import java.io.File;
import java.io.IOException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class F {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f6176b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final NativeSharedCounter f6177c = new NativeSharedCounter();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f6178a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final F b(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
            int fd = parcelFileDescriptor.getFd();
            if (c().nativeTruncateFile(fd) != 0) {
                throw new IOException("Failed to truncate counter file");
            }
            long jNativeCreateSharedCounter = c().nativeCreateSharedCounter(fd);
            if (jNativeCreateSharedCounter >= 0) {
                return new F(jNativeCreateSharedCounter, null);
            }
            throw new IOException("Failed to mmap counter file");
        }

        public final F a(Function0 produceFile) throws Throwable {
            ParcelFileDescriptor parcelFileDescriptorOpen;
            Intrinsics.checkNotNullParameter(produceFile, "produceFile");
            try {
                parcelFileDescriptorOpen = ParcelFileDescriptor.open((File) produceFile.invoke(), 939524096);
                try {
                    F fB = b(parcelFileDescriptorOpen);
                    if (parcelFileDescriptorOpen != null) {
                        parcelFileDescriptorOpen.close();
                    }
                    return fB;
                } catch (Throwable th) {
                    th = th;
                    if (parcelFileDescriptorOpen != null) {
                        parcelFileDescriptorOpen.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                parcelFileDescriptorOpen = null;
            }
        }

        public final NativeSharedCounter c() {
            return F.f6177c;
        }

        public final void d() {
            System.loadLibrary("datastore_shared_counter");
        }

        private a() {
        }
    }

    public /* synthetic */ F(long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10);
    }

    public final int b() {
        return f6177c.nativeGetCounterValue(this.f6178a);
    }

    public final int c() {
        return f6177c.nativeIncrementAndGetCounterValue(this.f6178a);
    }

    private F(long j10) {
        this.f6178a = j10;
    }
}
