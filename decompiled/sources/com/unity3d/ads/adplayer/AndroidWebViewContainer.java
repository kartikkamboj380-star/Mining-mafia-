package com.unity3d.ads.adplayer;

import I8.AbstractC0673i;
import I8.AbstractC0677k;
import I8.N;
import I8.N0;
import I8.O;
import I8.P;
import I8.W;
import L8.AbstractC0806g;
import L8.InterfaceC0804e;
import L8.InterfaceC0805f;
import L8.K;
import L8.M;
import L8.x;
import O.AbstractC0845c0;
import O.C0;
import O.J;
import R8.g;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.protobuf.CodedOutputStream;
import com.unity3d.ads.adplayer.model.ErrorReason;
import com.unity3d.ads.adplayer.model.WebViewBridgeInterface;
import com.unity3d.ads.adplayer.model.WebViewClientError;
import com.unity3d.ads.core.domain.SendWebViewClientErrorDiagnostics;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p129m8.m;
import p129m8.n;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:68)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:31)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:31)
    */
/* JADX INFO: loaded from: classes3.dex */
@Metadata
@SuppressLint({"ClickableViewAccessibility"})
public final class AndroidWebViewContainer implements WebViewContainer {

    @NotNull
    private static final String JS_CLOSING_PARENTHESES = ")";

    @NotNull
    private static final String JS_INSTRUCTION = "javascript:window.nativebridge.";

    @NotNull
    private static final String JS_OPENING_PARENTHESES = "(";

    @NotNull
    private static final String JS_SEMICOLON = ";";

    @NotNull
    private final x _lastInputEvent;

    @NotNull
    private final Context context;

    @NotNull
    private final K lastInputEvent;

    @NotNull
    private final O scope;

    @NotNull
    private final SendWebViewClientErrorDiagnostics sendWebViewClientErrorDiagnostics;

    @NotNull
    private final WebView webView;

    @NotNull
    private final AndroidWebViewClient webViewClient;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final StringBuilder SHARED_STRING_BUILDER = new StringBuilder(CodedOutputStream.DEFAULT_BUFFER_SIZE);

    @NotNull
    private static final R8.a SHARED_STRING_MUTEX = g.b(false, 1, null);

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$2, reason: invalid class name */
    @f(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer$2", f = "AndroidWebViewContainer.kt", l = {56}, m = "invokeSuspend")
    @Metadata
    static final class AnonymousClass2 extends l implements Function2<Boolean, p169q8.b, Object> {
        int label;

        AnonymousClass2(p169q8.b bVar) {
            super(2, bVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final p169q8.b create(@Nullable Object obj, @NotNull p169q8.b bVar) {
            return AndroidWebViewContainer.this.new AnonymousClass2(bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (p169q8.b) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objE = p179r8.b.e();
            int i10 = this.label;
            if (i10 == 0) {
                n.b(obj);
                AndroidWebViewContainer androidWebViewContainer = AndroidWebViewContainer.this;
                this.label = 1;
                if (androidWebViewContainer.onRenderProcessGone(this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                n.b(obj);
            }
            return Unit.f45918a;
        }

        @Nullable
        public final Object invoke(boolean z9, @Nullable p169q8.b bVar) {
            return ((AnonymousClass2) create(Boolean.valueOf(z9), bVar)).invokeSuspend(Unit.f45918a);
        }
    }

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getSHARED_STRING_BUILDER$annotations() {
        }

        @NotNull
        public final StringBuilder getSHARED_STRING_BUILDER() {
            return AndroidWebViewContainer.SHARED_STRING_BUILDER;
        }

        @NotNull
        public final R8.a getSHARED_STRING_MUTEX() {
            return AndroidWebViewContainer.SHARED_STRING_MUTEX;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$addJavascriptInterface$1, reason: invalid class name */
    @f(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer", f = "AndroidWebViewContainer.kt", l = {147}, m = "addJavascriptInterface")
    @Metadata
    static final class AnonymousClass1 extends d {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(p169q8.b bVar) {
            super(bVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= LinearLayoutManager.INVALID_OFFSET;
            return AndroidWebViewContainer.this.addJavascriptInterface(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$addJavascriptInterface$2, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer$addJavascriptInterface$2", f = "AndroidWebViewContainer.kt", l = {}, m = "invokeSuspend")
    @Metadata
    static final class C68242 extends l implements Function2<O, p169q8.b, Object> {
        final /* synthetic */ String $name;
        final /* synthetic */ WebViewBridge $webViewBridgeInterface;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C68242(String str, WebViewBridge webViewBridge, p169q8.b bVar) {
            super(2, bVar);
            this.$name = str;
            this.$webViewBridgeInterface = webViewBridge;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final p169q8.b create(@Nullable Object obj, @NotNull p169q8.b bVar) {
            return AndroidWebViewContainer.this.new C68242(this.$name, this.$webViewBridgeInterface, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull O o10, @Nullable p169q8.b bVar) {
            return ((C68242) create(o10, bVar)).invokeSuspend(Unit.f45918a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            p179r8.b.e();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n.b(obj);
            final WebViewBridge webViewBridge = this.$webViewBridgeInterface;
            AndroidWebViewContainer.this.getWebView().addJavascriptInterface(new WebViewBridgeInterface() { // from class: com.unity3d.ads.adplayer.AndroidWebViewContainer$addJavascriptInterface$2$wrapper$1
                @Override // com.unity3d.ads.adplayer.model.WebViewBridgeInterface
                @JavascriptInterface
                public void handleCallback(@NotNull String callbackId, @NotNull String callbackStatus, @NotNull String rawParameters) {
                    Intrinsics.checkNotNullParameter(callbackId, "callbackId");
                    Intrinsics.checkNotNullParameter(callbackStatus, "callbackStatus");
                    Intrinsics.checkNotNullParameter(rawParameters, "rawParameters");
                    webViewBridge.handleCallback(callbackId, callbackStatus, rawParameters);
                }

                @Override // com.unity3d.ads.adplayer.model.WebViewBridgeInterface
                @JavascriptInterface
                public void handleInvocation(@NotNull String message) {
                    Intrinsics.checkNotNullParameter(message, "message");
                    webViewBridge.handleInvocation(message);
                }
            }, this.$name);
            return Unit.f45918a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$destroy$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer", f = "AndroidWebViewContainer.kt", l = {165}, m = "destroy")
    @Metadata
    static final class C68251 extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C68251(p169q8.b bVar) {
            super(bVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= LinearLayoutManager.INVALID_OFFSET;
            return AndroidWebViewContainer.this.destroy(this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$destroy$2, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer$destroy$2", f = "AndroidWebViewContainer.kt", l = {}, m = "invokeSuspend")
    @Metadata
    static final class C68262 extends l implements Function2<O, p169q8.b, Object> {
        int label;

        C68262(p169q8.b bVar) {
            super(2, bVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final p169q8.b create(@Nullable Object obj, @NotNull p169q8.b bVar) {
            return AndroidWebViewContainer.this.new C68262(bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull O o10, @Nullable p169q8.b bVar) {
            return ((C68262) create(o10, bVar)).invokeSuspend(Unit.f45918a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            p179r8.b.e();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n.b(obj);
            ViewParent parent = AndroidWebViewContainer.this.getWebView().getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(AndroidWebViewContainer.this.getWebView());
            }
            AndroidWebViewContainer.this.getWebView().destroy();
            return Unit.f45918a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$evaluateJavascript$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer", f = "AndroidWebViewContainer.kt", l = {210, 139}, m = "evaluateJavascript")
    @Metadata
    static final class C68271 extends d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C68271(p169q8.b bVar) {
            super(bVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= LinearLayoutManager.INVALID_OFFSET;
            return AndroidWebViewContainer.this.evaluateJavascript(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$evaluateJavascript$2, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer$evaluateJavascript$2", f = "AndroidWebViewContainer.kt", l = {}, m = "invokeSuspend")
    @Metadata
    static final class C68282 extends l implements Function2<O, p169q8.b, Object> {
        final /* synthetic */ String $selectedString;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C68282(String str, p169q8.b bVar) {
            super(2, bVar);
            this.$selectedString = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final p169q8.b create(@Nullable Object obj, @NotNull p169q8.b bVar) {
            return AndroidWebViewContainer.this.new C68282(this.$selectedString, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull O o10, @Nullable p169q8.b bVar) {
            return ((C68282) create(o10, bVar)).invokeSuspend(Unit.f45918a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            p179r8.b.e();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n.b(obj);
            AndroidWebViewContainer.this.getWebView().evaluateJavascript(this.$selectedString, null);
            return Unit.f45918a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$loadUrl$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer", f = "AndroidWebViewContainer.kt", l = {88, 92, 94}, m = "loadUrl")
    @Metadata
    static final class C68291 extends d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C68291(p169q8.b bVar) {
            super(bVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= LinearLayoutManager.INVALID_OFFSET;
            return AndroidWebViewContainer.this.loadUrl(null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$loadUrl$2, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer$loadUrl$2", f = "AndroidWebViewContainer.kt", l = {}, m = "invokeSuspend")
    @Metadata
    static final class C68302 extends l implements Function2<O, p169q8.b, Object> {
        final /* synthetic */ String $url;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C68302(String str, p169q8.b bVar) {
            super(2, bVar);
            this.$url = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final p169q8.b create(@Nullable Object obj, @NotNull p169q8.b bVar) {
            return AndroidWebViewContainer.this.new C68302(this.$url, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull O o10, @Nullable p169q8.b bVar) {
            return ((C68302) create(o10, bVar)).invokeSuspend(Unit.f45918a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            p179r8.b.e();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n.b(obj);
            AndroidWebViewContainer.this.getWebView().loadUrl(this.$url);
            return Unit.f45918a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$onRenderProcessGone$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer", f = "AndroidWebViewContainer.kt", l = {76}, m = "onRenderProcessGone")
    @Metadata
    static final class C68311 extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C68311(p169q8.b bVar) {
            super(bVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= LinearLayoutManager.INVALID_OFFSET;
            return AndroidWebViewContainer.this.onRenderProcessGone(this);
        }
    }

    public AndroidWebViewContainer(@NotNull WebView webView, @NotNull AndroidWebViewClient webViewClient, @NotNull SendWebViewClientErrorDiagnostics sendWebViewClientErrorDiagnostics, @NotNull I8.K mainDispatcher, @NotNull I8.K defaultDispatcher, @NotNull O adPlayerScope, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(webViewClient, "webViewClient");
        Intrinsics.checkNotNullParameter(sendWebViewClientErrorDiagnostics, "sendWebViewClientErrorDiagnostics");
        Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
        Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        Intrinsics.checkNotNullParameter(adPlayerScope, "adPlayerScope");
        Intrinsics.checkNotNullParameter(context, "context");
        this.webView = webView;
        this.webViewClient = webViewClient;
        this.sendWebViewClientErrorDiagnostics = sendWebViewClientErrorDiagnostics;
        this.context = context;
        O oH = P.h(P.h(adPlayerScope, mainDispatcher), new N("AndroidWebViewContainer"));
        this.scope = oH;
        x xVarA = M.a(null);
        this._lastInputEvent = xVarA;
        this.lastInputEvent = AbstractC0806g.b(xVarA);
        final K kIsRenderProcessGone = webViewClient.isRenderProcessGone();
        AbstractC0806g.x(AbstractC0806g.A(new InterfaceC0804e() { // from class: com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1

            /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1$2, reason: invalid class name */
            @Metadata
            public static final class AnonymousClass2<T> implements InterfaceC0805f {
                final /* synthetic */ InterfaceC0805f $this_unsafeFlow;

                /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1$2$1, reason: invalid class name */
                @f(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1$2", f = "AndroidWebViewContainer.kt", l = {223}, m = "emit")
                @Metadata
                public static final class AnonymousClass1 extends d {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(p169q8.b bVar) {
                        super(bVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.result = obj;
                        this.label |= LinearLayoutManager.INVALID_OFFSET;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC0805f interfaceC0805f) {
                    this.$this_unsafeFlow = interfaceC0805f;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // L8.InterfaceC0805f
                @Nullable
                public final Object emit(Object obj, @NotNull p169q8.b bVar) {
                    AnonymousClass1 anonymousClass1;
                    if (bVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) bVar;
                        int i10 = anonymousClass1.label;
                        if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                            anonymousClass1.label = i10 - LinearLayoutManager.INVALID_OFFSET;
                        } else {
                            anonymousClass1 = new AnonymousClass1(bVar);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(bVar);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object objE = p179r8.b.e();
                    int i11 = anonymousClass1.label;
                    if (i11 == 0) {
                        n.b(obj2);
                        InterfaceC0805f interfaceC0805f = this.$this_unsafeFlow;
                        if (((Boolean) obj).booleanValue()) {
                            anonymousClass1.label = 1;
                            if (interfaceC0805f.emit(obj, anonymousClass1) == objE) {
                                return objE;
                            }
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        n.b(obj2);
                    }
                    return Unit.f45918a;
                }
            }

            @Override // L8.InterfaceC0804e
            @Nullable
            public Object collect(@NotNull InterfaceC0805f interfaceC0805f, @NotNull p169q8.b bVar) {
                Object objCollect = kIsRenderProcessGone.collect(new AnonymousClass2(interfaceC0805f), bVar);
                return objCollect == p179r8.b.e() ? objCollect : Unit.f45918a;
            }
        }, new AnonymousClass2(null)), P.h(oH, defaultDispatcher));
        webView.setOnTouchListener(new View.OnTouchListener() { // from class: com.unity3d.ads.adplayer.a
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return AndroidWebViewContainer._init_$lambda$1(this.f42722a, view, motionEvent);
            }
        });
        applySafeAreaInsets();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$1(AndroidWebViewContainer this$0, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0 && actionMasked != 1 && actionMasked != 5 && actionMasked != 6) {
            return false;
        }
        this$0._lastInputEvent.setValue(motionEvent);
        return false;
    }

    private final void applySafeAreaInsets() {
        AbstractC0845c0.A0(this.webView, new J() { // from class: com.unity3d.ads.adplayer.b
            @Override // O.J
            public final C0 a(View view, C0 c10) {
                return AndroidWebViewContainer.applySafeAreaInsets$lambda$6(this.f42723a, view, c10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0 applySafeAreaInsets$lambda$6(AndroidWebViewContainer this$0, View v10, C0 insets) {
        Object objB;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(v10, "v");
        Intrinsics.checkNotNullParameter(insets, "insets");
        F.b bVarF = insets.f(C0.l.g());
        Intrinsics.checkNotNullExpressionValue(bVarF, "insets.getInsets(WindowI…Compat.Type.systemBars())");
        F.b bVarF2 = insets.f(C0.l.a());
        Intrinsics.checkNotNullExpressionValue(bVarF2, "insets.getInsets(WindowI…pat.Type.displayCutout())");
        try {
            m.a aVar = m.f46450b;
            objB = m.b(Float.valueOf(this$0.context.getResources().getDisplayMetrics().density));
        } catch (Throwable th) {
            m.a aVar2 = m.f46450b;
            objB = m.b(n.a(th));
        }
        Float fValueOf = Float.valueOf(1.0f);
        if (m.f(objB)) {
            objB = fValueOf;
        }
        float fFloatValue = ((Number) objB).floatValue();
        int iApplySafeAreaInsets$lambda$6$toPx = applySafeAreaInsets$lambda$6$toPx(Math.max(bVarF.f650a, bVarF2.f650a), fFloatValue);
        int iApplySafeAreaInsets$lambda$6$toPx2 = applySafeAreaInsets$lambda$6$toPx(Math.max(bVarF.f651b, bVarF2.f651b), fFloatValue);
        AbstractC0677k.d(this$0.scope, null, null, new AndroidWebViewContainer$applySafeAreaInsets$1$1(this$0, StringsKt.j("\n                (function() {\n                    const root = document.documentElement;\n                    root.style.setProperty('--safe-area-inset-left', '" + iApplySafeAreaInsets$lambda$6$toPx + "px');\n                    root.style.setProperty('--safe-area-inset-right', '" + applySafeAreaInsets$lambda$6$toPx(Math.max(bVarF.f652c, bVarF2.f652c), fFloatValue) + "px');\n                    root.style.setProperty('--safe-area-inset-top', '" + iApplySafeAreaInsets$lambda$6$toPx2 + "px');\n                    root.style.setProperty('--safe-area-inset-bottom', '" + applySafeAreaInsets$lambda$6$toPx(Math.max(bVarF.f653d, bVarF2.f653d), fFloatValue) + "px');\n                })();\n            "), null), 3, null);
        return insets;
    }

    private static final int applySafeAreaInsets$lambda$6$toPx(int i10, float f10) {
        return (int) (i10 / f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object onRenderProcessGone(p169q8.b bVar) {
        C68311 c68311;
        AndroidWebViewContainer androidWebViewContainer;
        if (bVar instanceof C68311) {
            c68311 = (C68311) bVar;
            int i10 = c68311.label;
            if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c68311.label = i10 - LinearLayoutManager.INVALID_OFFSET;
            } else {
                c68311 = new C68311(bVar);
            }
        } else {
            c68311 = new C68311(bVar);
        }
        Object obj = c68311.result;
        Object objE = p179r8.b.e();
        int i11 = c68311.label;
        if (i11 == 0) {
            n.b(obj);
            c68311.L$0 = this;
            c68311.label = 1;
            if (destroy(c68311) == objE) {
                return objE;
            }
            androidWebViewContainer = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidWebViewContainer = (AndroidWebViewContainer) c68311.L$0;
            n.b(obj);
        }
        androidWebViewContainer.sendWebViewClientErrorDiagnostics.invoke(CollectionsKt.d(new WebViewClientError("Render process gone", ErrorReason.REASON_WEBVIEW_RENDER_PROCESS_GONE, null, 4, null)));
        return Unit.f45918a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.adplayer.WebViewContainer
    @Nullable
    public Object addJavascriptInterface(@NotNull WebViewBridge webViewBridge, @NotNull String str, @NotNull p169q8.b bVar) {
        AnonymousClass1 anonymousClass1;
        if (bVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) bVar;
            int i10 = anonymousClass1.label;
            if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                anonymousClass1.label = i10 - LinearLayoutManager.INVALID_OFFSET;
            } else {
                anonymousClass1 = new AnonymousClass1(bVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(bVar);
        }
        Object obj = anonymousClass1.result;
        Object objE = p179r8.b.e();
        int i11 = anonymousClass1.label;
        try {
            if (i11 == 0) {
                n.b(obj);
                CoroutineContext coroutineContext = this.scope.getCoroutineContext();
                C68242 c68242 = new C68242(str, webViewBridge, null);
                anonymousClass1.label = 1;
                if (AbstractC0673i.g(coroutineContext, c68242, anonymousClass1) == objE) {
                    return objE;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                n.b(obj);
            }
        } catch (CancellationException unused) {
        }
        return Unit.f45918a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.adplayer.WebViewContainer
    @Nullable
    public Object destroy(@NotNull p169q8.b bVar) {
        C68251 c68251;
        AndroidWebViewContainer androidWebViewContainer;
        if (bVar instanceof C68251) {
            c68251 = (C68251) bVar;
            int i10 = c68251.label;
            if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c68251.label = i10 - LinearLayoutManager.INVALID_OFFSET;
            } else {
                c68251 = new C68251(bVar);
            }
        } else {
            c68251 = new C68251(bVar);
        }
        Object obj = c68251.result;
        Object objE = p179r8.b.e();
        int i11 = c68251.label;
        if (i11 == 0) {
            n.b(obj);
            CoroutineContext coroutineContextPlus = this.scope.getCoroutineContext().plus(N0.f1733a);
            C68262 c68262 = new C68262(null);
            c68251.L$0 = this;
            c68251.label = 1;
            if (AbstractC0673i.g(coroutineContextPlus, c68262, c68251) == objE) {
                return objE;
            }
            androidWebViewContainer = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidWebViewContainer = (AndroidWebViewContainer) c68251.L$0;
            n.b(obj);
        }
        P.d(androidWebViewContainer.scope, null, 1, null);
        return Unit.f45918a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00fb, code lost:
    
        if (r0.G(r2) == r3) goto L31;
     */
    @Override // com.unity3d.ads.adplayer.WebViewContainer
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object evaluateJavascript(@org.jetbrains.annotations.NotNull com.unity3d.ads.adplayer.HandlerType r21, @org.jetbrains.annotations.NotNull org.json.JSONArray r22, @org.jetbrains.annotations.NotNull p169q8.b r23) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidWebViewContainer.evaluateJavascript(com.unity3d.ads.adplayer.HandlerType, org.json.JSONArray, q8.b):java.lang.Object");
    }

    @Override // com.unity3d.ads.adplayer.WebViewContainer
    @NotNull
    public K getLastInputEvent() {
        return this.lastInputEvent;
    }

    @NotNull
    public final O getScope() {
        return this.scope;
    }

    @NotNull
    public final WebView getWebView() {
        return this.webView;
    }

    @NotNull
    public final x get_lastInputEvent() {
        return this._lastInputEvent;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0083  */
    /* JADX WARN: Code duplicated, block: B:30:0x0090  */
    /* JADX WARN: Code duplicated, block: B:33:0x009d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.adplayer.WebViewContainer
    @Nullable
    public Object loadUrl(@NotNull String str, @NotNull p169q8.b bVar) throws LoadWebViewError {
        C68291 c68291;
        AndroidWebViewContainer androidWebViewContainer;
        List<WebViewClientError> list;
        AndroidWebViewContainer androidWebViewContainer2;
        List<WebViewClientError> list2;
        if (bVar instanceof C68291) {
            c68291 = (C68291) bVar;
            int i10 = c68291.label;
            if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c68291.label = i10 - LinearLayoutManager.INVALID_OFFSET;
            } else {
                c68291 = new C68291(bVar);
            }
        } else {
            c68291 = new C68291(bVar);
        }
        Object objR0 = c68291.result;
        Object objE = p179r8.b.e();
        int i11 = c68291.label;
        if (i11 == 0) {
            n.b(objR0);
            CoroutineContext coroutineContext = this.scope.getCoroutineContext();
            C68302 c68302 = new C68302(str, null);
            c68291.L$0 = this;
            c68291.label = 1;
            if (AbstractC0673i.g(coroutineContext, c68302, c68291) != objE) {
                androidWebViewContainer = this;
            }
            return objE;
        }
        if (i11 == 1) {
            androidWebViewContainer = (AndroidWebViewContainer) c68291.L$0;
            n.b(objR0);
        } else {
            if (i11 == 2) {
                androidWebViewContainer = (AndroidWebViewContainer) c68291.L$0;
                n.b(objR0);
                list = (List) objR0;
                if (!list.isEmpty()) {
                    return Unit.f45918a;
                }
                c68291.L$0 = androidWebViewContainer;
                c68291.L$1 = list;
                c68291.label = 3;
                if (androidWebViewContainer.destroy(c68291) != objE) {
                    androidWebViewContainer2 = androidWebViewContainer;
                    list2 = list;
                }
                return objE;
            }
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list2 = (List) c68291.L$1;
            androidWebViewContainer2 = (AndroidWebViewContainer) c68291.L$0;
            n.b(objR0);
        }
        androidWebViewContainer2.sendWebViewClientErrorDiagnostics.invoke(list2);
        throw new LoadWebViewError(list2);
        W onLoadFinished = androidWebViewContainer.webViewClient.getOnLoadFinished();
        c68291.L$0 = androidWebViewContainer;
        c68291.label = 2;
        objR0 = onLoadFinished.R0(c68291);
        if (objR0 != objE) {
            list = (List) objR0;
            if (!list.isEmpty()) {
                return Unit.f45918a;
            }
            c68291.L$0 = androidWebViewContainer;
            c68291.L$1 = list;
            c68291.label = 3;
            if (androidWebViewContainer.destroy(c68291) != objE) {
                androidWebViewContainer2 = androidWebViewContainer;
                list2 = list;
                androidWebViewContainer2.sendWebViewClientErrorDiagnostics.invoke(list2);
                throw new LoadWebViewError(list2);
            }
        }
        return objE;
    }
}
