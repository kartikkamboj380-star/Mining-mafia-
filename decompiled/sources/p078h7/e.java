package p078h7;

import I8.AbstractC0673i;
import I8.O;
import android.net.Uri;
import com.unity3d.services.core.network.model.HttpRequest;
import java.net.URL;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p048e7.C6956b;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements p078h7.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f44820c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C6956b f44821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CoroutineContext f44822b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class b extends l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f44823a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map f44825c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2 f44826d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function2 f44827e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Map map, Function2 function2, Function2 function3, p169q8.b bVar) {
            super(2, bVar);
            this.f44825c = map;
            this.f44826d = function2;
            this.f44827e = function3;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p169q8.b create(Object obj, p169q8.b bVar) {
            return e.this.new b(this.f44825c, this.f44826d, this.f44827e, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, p169q8.b bVar) {
            return ((b) create(o10, bVar)).invokeSuspend(Unit.f45918a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x00cb, code lost:
        
            if (r8.invoke(r1, r7) == r0) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00e0, code lost:
        
            if (r1.invoke(r3, r7) == r0) goto L36;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                Method dump skipped, instruction units count: 230
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: h7.e.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public e(C6956b appInfo, CoroutineContext blockingDispatcher) {
        Intrinsics.checkNotNullParameter(appInfo, "appInfo");
        Intrinsics.checkNotNullParameter(blockingDispatcher, "blockingDispatcher");
        this.f44821a = appInfo;
        this.f44822b = blockingDispatcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final URL c() {
        return new URL(new Uri.Builder().scheme(HttpRequest.DEFAULT_SCHEME).authority("firebase-settings.crashlytics.com").appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp").appendPath(this.f44821a.b()).appendPath("settings").appendQueryParameter("build_version", this.f44821a.a().a()).appendQueryParameter("display_version", this.f44821a.a().f()).build().toString());
    }

    @Override // p078h7.a
    public Object a(Map map, Function2 function2, Function2 function3, p169q8.b bVar) {
        Object objG = AbstractC0673i.g(this.f44822b, new b(map, function2, function3, null), bVar);
        return objG == p179r8.b.e() ? objG : Unit.f45918a;
    }
}
