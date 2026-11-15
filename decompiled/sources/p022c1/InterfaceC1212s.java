package p022c1;

import com.reactnativecommunity.clipboard.ClipboardModule;
import kotlin.jvm.internal.Intrinsics;
import r9.InterfaceC7107j;

/* JADX INFO: renamed from: c1.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1212s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f11783a = a.f11787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final InterfaceC1212s f11784b = new InterfaceC1212s() { // from class: c1.p
        @Override // p022c1.InterfaceC1212s
        public final boolean c(String str, InterfaceC7107j interfaceC7107j) {
            return InterfaceC1212s.e(str, interfaceC7107j);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final InterfaceC1212s f11785c = new InterfaceC1212s() { // from class: c1.q
        @Override // p022c1.InterfaceC1212s
        public final boolean c(String str, InterfaceC7107j interfaceC7107j) {
            return InterfaceC1212s.a(str, interfaceC7107j);
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final InterfaceC1212s f11786d = new InterfaceC1212s() { // from class: c1.r
        @Override // p022c1.InterfaceC1212s
        public final boolean c(String str, InterfaceC7107j interfaceC7107j) {
            return InterfaceC1212s.g(str, interfaceC7107j);
        }
    };

    /* JADX INFO: renamed from: c1.s$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f11787a = new a();

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static boolean a(String str, InterfaceC7107j interfaceC7107j) {
        if (str != null) {
            return Intrinsics.b(str, ClipboardModule.MIMETYPE_JPEG) || Intrinsics.b(str, ClipboardModule.MIMETYPE_WEBP) || Intrinsics.b(str, ClipboardModule.MIMETYPE_HEIC) || Intrinsics.b(str, ClipboardModule.MIMETYPE_HEIF);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static boolean e(String str, InterfaceC7107j interfaceC7107j) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static boolean g(String str, InterfaceC7107j interfaceC7107j) {
        return true;
    }

    boolean c(String str, InterfaceC7107j interfaceC7107j);
}
