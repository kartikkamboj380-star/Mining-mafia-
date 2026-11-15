package com.google.firebase.sessions;

import I8.O;
import I8.P;
import W.C0979d;
import W.C0985j;
import W.E;
import W.InterfaceC0984i;
import W.y;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.google.firebase.sessions.b;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.FileAttribute;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p048e7.C6956b;
import p048e7.C6966l;
import p048e7.G;
import p048e7.H;
import p048e7.L;
import p048e7.V;
import p048e7.Z;
import p048e7.a0;
import p048e7.b0;
import p048e7.c0;
import p078h7.h;
import p078h7.i;

/* JADX INFO: loaded from: classes3.dex */
public interface b {

    public interface a {
        a a(H6.e eVar);

        a b(p007a6.f fVar);

        b build();

        a c(CoroutineContext coroutineContext);

        a d(G6.b bVar);

        a e(CoroutineContext coroutineContext);

        a f(Context context);
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.b$b, reason: collision with other inner class name */
    public interface InterfaceC0375b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f40721a = a.f40722a;

        /* JADX INFO: renamed from: com.google.firebase.sessions.b$b$a */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            static final /* synthetic */ a f40722a = new a();

            private a() {
            }

            private final InterfaceC0984i f(E e10, X.b bVar, List list, O o10, Function0 function0) {
                return h() ? y.f6471a.a(e10, bVar, list, o10, function0) : C0985j.f6236a.a(e10, bVar, list, o10, function0);
            }

            static /* synthetic */ InterfaceC0984i g(a aVar, E e10, X.b bVar, List list, O o10, Function0 function0, int i10, Object obj) {
                if ((i10 & 4) != 0) {
                    list = CollectionsKt.i();
                }
                return aVar.f(e10, bVar, list, o10, function0);
            }

            private final boolean h() {
                try {
                    System.loadLibrary("datastore_shared_counter");
                    return true;
                } catch (SecurityException | UnsatisfiedLinkError unused) {
                    return false;
                }
            }

            private final void i(File file) throws IOException {
                File parentFile = file.getParentFile();
                if (parentFile == null) {
                    return;
                }
                if (parentFile.exists() && !parentFile.isDirectory() && Intrinsics.b(parentFile.getName(), "firebaseSessions") && !parentFile.delete()) {
                    throw new IOException("Failed to delete conflicting file: " + parentFile);
                }
                if (parentFile.isDirectory()) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    try {
                        Files.createDirectories(parentFile.toPath(), new FileAttribute[0]);
                        return;
                    } catch (Exception e10) {
                        throw new IOException("Failed to create directory: " + parentFile, e10);
                    }
                }
                if (parentFile.mkdirs() || parentFile.isDirectory()) {
                    return;
                }
                throw new IOException("Failed to create directory: " + parentFile);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final h k(C0979d ex) {
                Intrinsics.checkNotNullParameter(ex, "ex");
                Log.w("FirebaseSessions", "CorruptionException in session configs DataStore", ex);
                return i.f44841a.getDefaultValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final File l(Context context) throws IOException {
                File fileA = V.a.a(context, "firebaseSessions/sessionConfigsDataStore.data");
                f40722a.i(fileA);
                return fileA;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final G n(H h10, C0979d ex) {
                Intrinsics.checkNotNullParameter(ex, "ex");
                Log.w("FirebaseSessions", "CorruptionException in session data DataStore", ex);
                return h10.getDefaultValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final File o(Context context) throws IOException {
                File fileA = V.a.a(context, "firebaseSessions/sessionDataStore.data");
                f40722a.i(fileA);
                return fileA;
            }

            public final C6956b e(p007a6.f firebaseApp) {
                Intrinsics.checkNotNullParameter(firebaseApp, "firebaseApp");
                return L.f43324a.b(firebaseApp);
            }

            public final InterfaceC0984i j(final Context appContext, CoroutineContext blockingDispatcher) {
                Intrinsics.checkNotNullParameter(appContext, "appContext");
                Intrinsics.checkNotNullParameter(blockingDispatcher, "blockingDispatcher");
                return g(this, i.f44841a, new X.b(new Function1() { // from class: e7.o
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return b.InterfaceC0375b.a.k((C0979d) obj);
                    }
                }), null, P.a(blockingDispatcher), new Function0() { // from class: e7.p
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return b.InterfaceC0375b.a.l(appContext);
                    }
                }, 4, null);
            }

            public final InterfaceC0984i m(final Context appContext, CoroutineContext blockingDispatcher, final H sessionDataSerializer) {
                Intrinsics.checkNotNullParameter(appContext, "appContext");
                Intrinsics.checkNotNullParameter(blockingDispatcher, "blockingDispatcher");
                Intrinsics.checkNotNullParameter(sessionDataSerializer, "sessionDataSerializer");
                return g(this, sessionDataSerializer, new X.b(new Function1() { // from class: e7.q
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return b.InterfaceC0375b.a.n(sessionDataSerializer, (C0979d) obj);
                    }
                }), null, P.a(blockingDispatcher), new Function0() { // from class: e7.r
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return b.InterfaceC0375b.a.o(appContext);
                    }
                }, 4, null);
            }

            public final Z p() {
                return a0.f43424a;
            }

            public final b0 q() {
                return c0.f43467a;
            }
        }
    }

    V a();

    C6966l b();
}
