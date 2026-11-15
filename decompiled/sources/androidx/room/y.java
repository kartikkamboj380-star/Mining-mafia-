package androidx.room;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class y implements A0.h, g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f10931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f10932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final File f10933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Callable f10934d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f10935e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final A0.h f10936f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private f f10937g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f10938h;

    public y(Context context, String str, File file, Callable callable, int i10, A0.h delegate) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f10931a = context;
        this.f10932b = str;
        this.f10933c = file;
        this.f10934d = callable;
        this.f10935e = i10;
        this.f10936f = delegate;
    }

    private final void a(File file, boolean z9) throws IOException {
        ReadableByteChannel readableByteChannelNewChannel;
        if (this.f10932b != null) {
            readableByteChannelNewChannel = Channels.newChannel(this.f10931a.getAssets().open(this.f10932b));
            Intrinsics.checkNotNullExpressionValue(readableByteChannelNewChannel, "newChannel(context.assets.open(copyFromAssetPath))");
        } else if (this.f10933c != null) {
            readableByteChannelNewChannel = new FileInputStream(this.f10933c).getChannel();
            Intrinsics.checkNotNullExpressionValue(readableByteChannelNewChannel, "FileInputStream(copyFromFile).channel");
        } else {
            Callable callable = this.f10934d;
            if (callable == null) {
                throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
            }
            try {
                readableByteChannelNewChannel = Channels.newChannel((InputStream) callable.call());
                Intrinsics.checkNotNullExpressionValue(readableByteChannelNewChannel, "newChannel(inputStream)");
            } catch (Exception e10) {
                throw new IOException("inputStreamCallable exception on call", e10);
            }
        }
        File intermediateFile = File.createTempFile("room-copy-helper", ".tmp", this.f10931a.getCacheDir());
        intermediateFile.deleteOnExit();
        FileChannel output = new FileOutputStream(intermediateFile).getChannel();
        Intrinsics.checkNotNullExpressionValue(output, "output");
        p241y0.c.a(readableByteChannelNewChannel, output);
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + file.getAbsolutePath());
        }
        Intrinsics.checkNotNullExpressionValue(intermediateFile, "intermediateFile");
        c(intermediateFile, z9);
        if (intermediateFile.renameTo(file)) {
            return;
        }
        throw new IOException("Failed to move intermediate file (" + intermediateFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
    }

    private final void c(File file, boolean z9) {
        f fVar = this.f10937g;
        if (fVar == null) {
            Intrinsics.r("databaseConfiguration");
            fVar = null;
        }
        fVar.getClass();
    }

    private final void j(boolean z9) {
        String databaseName = getDatabaseName();
        if (databaseName == null) {
            throw new IllegalStateException("Required value was null.");
        }
        File databaseFile = this.f10931a.getDatabasePath(databaseName);
        f fVar = this.f10937g;
        f fVar2 = null;
        if (fVar == null) {
            Intrinsics.r("databaseConfiguration");
            fVar = null;
        }
        C0.a aVar = new C0.a(databaseName, this.f10931a.getFilesDir(), fVar.f10826s);
        try {
            C0.a.c(aVar, false, 1, null);
            if (!databaseFile.exists()) {
                try {
                    Intrinsics.checkNotNullExpressionValue(databaseFile, "databaseFile");
                    a(databaseFile, z9);
                    aVar.d();
                    return;
                } catch (IOException e10) {
                    throw new RuntimeException("Unable to copy database file.", e10);
                }
            }
            try {
                Intrinsics.checkNotNullExpressionValue(databaseFile, "databaseFile");
                int iC = p241y0.b.c(databaseFile);
                if (iC == this.f10935e) {
                    aVar.d();
                    return;
                }
                f fVar3 = this.f10937g;
                if (fVar3 == null) {
                    Intrinsics.r("databaseConfiguration");
                } else {
                    fVar2 = fVar3;
                }
                if (fVar2.a(iC, this.f10935e)) {
                    aVar.d();
                    return;
                }
                if (this.f10931a.deleteDatabase(databaseName)) {
                    try {
                        a(databaseFile, z9);
                    } catch (IOException e11) {
                        Log.w("ROOM", "Unable to copy database file.", e11);
                    }
                } else {
                    Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                }
                aVar.d();
                return;
            } catch (IOException e12) {
                Log.w("ROOM", "Unable to read database version.", e12);
                aVar.d();
                return;
            }
        } catch (Throwable th) {
            aVar.d();
            throw th;
        }
        aVar.d();
        throw th;
    }

    @Override // A0.h
    public A0.g J0() {
        if (!this.f10938h) {
            j(true);
            this.f10938h = true;
        }
        return getDelegate().J0();
    }

    @Override // A0.h, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        getDelegate().close();
        this.f10938h = false;
    }

    @Override // A0.h
    public String getDatabaseName() {
        return getDelegate().getDatabaseName();
    }

    @Override // androidx.room.g
    public A0.h getDelegate() {
        return this.f10936f;
    }

    public final void h(f databaseConfiguration) {
        Intrinsics.checkNotNullParameter(databaseConfiguration, "databaseConfiguration");
        this.f10937g = databaseConfiguration;
    }

    @Override // A0.h
    public void setWriteAheadLoggingEnabled(boolean z9) {
        getDelegate().setWriteAheadLoggingEnabled(z9);
    }
}
