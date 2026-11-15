package com.swmansion.rnscreens.gamma.tabs;

import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC1144o;
import com.facebook.react.uimanager.E0;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends ViewGroup implements K7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final E0 f42360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeakReference f42361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.swmansion.rnscreens.gamma.tabs.c f42362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f42363d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C8.d f42364e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C8.d f42365f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C8.d f42366g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C8.d f42367h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final C8.d f42368i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final C8.d f42369j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f42370k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final /* synthetic */ F8.i[] f42359m = {F.e(new kotlin.jvm.internal.q(a.class, "tabTitle", "getTabTitle()Ljava/lang/String;", 0)), F.e(new kotlin.jvm.internal.q(a.class, "badgeValue", "getBadgeValue()Ljava/lang/String;", 0)), F.e(new kotlin.jvm.internal.q(a.class, "tabBarItemBadgeTextColor", "getTabBarItemBadgeTextColor()Ljava/lang/Integer;", 0)), F.e(new kotlin.jvm.internal.q(a.class, "tabBarItemBadgeBackgroundColor", "getTabBarItemBadgeBackgroundColor()Ljava/lang/Integer;", 0)), F.e(new kotlin.jvm.internal.q(a.class, "iconResourceName", "getIconResourceName()Ljava/lang/String;", 0)), F.e(new kotlin.jvm.internal.q(a.class, "icon", "getIcon()Landroid/graphics/drawable/Drawable;", 0))};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C0394a f42358l = new C0394a(null);

    /* JADX INFO: renamed from: com.swmansion.rnscreens.gamma.tabs.a$a, reason: collision with other inner class name */
    public static final class C0394a {
        public /* synthetic */ C0394a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0394a() {
        }
    }

    public static final class b extends C8.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f42371b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Object obj, a aVar) {
            super(obj);
            this.f42371b = aVar;
        }

        @Override // C8.b
        protected void c(F8.i property, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            a aVar = this.f42371b;
            aVar.g((String) obj, (String) obj2);
        }
    }

    public static final class c extends C8.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f42372b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Object obj, a aVar) {
            super(obj);
            this.f42372b = aVar;
        }

        @Override // C8.b
        protected void c(F8.i property, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            a aVar = this.f42372b;
            aVar.g((String) obj, (String) obj2);
        }
    }

    public static final class d extends C8.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f42373b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Object obj, a aVar) {
            super(obj);
            this.f42373b = aVar;
        }

        @Override // C8.b
        protected void c(F8.i property, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            a aVar = this.f42373b;
            aVar.g((Integer) obj, (Integer) obj2);
        }
    }

    public static final class e extends C8.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f42374b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Object obj, a aVar) {
            super(obj);
            this.f42374b = aVar;
        }

        @Override // C8.b
        protected void c(F8.i property, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            a aVar = this.f42374b;
            aVar.g((Integer) obj, (Integer) obj2);
        }
    }

    public static final class f extends C8.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f42375b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Object obj, a aVar) {
            super(obj);
            this.f42375b = aVar;
        }

        @Override // C8.b
        protected void c(F8.i property, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            String str = (String) obj2;
            if (Intrinsics.b(str, (String) obj)) {
                return;
            }
            a aVar = this.f42375b;
            aVar.setIcon(L7.d.a(aVar.getReactContext(), str));
        }
    }

    public static final class g extends C8.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f42376b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Object obj, a aVar) {
            super(obj);
            this.f42376b = aVar;
        }

        @Override // C8.b
        protected void c(F8.i property, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            a aVar = this.f42376b;
            aVar.g((Drawable) obj, (Drawable) obj2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(E0 reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.f42360a = reactContext;
        this.f42361b = new WeakReference(null);
        C8.a aVar = C8.a.f414a;
        this.f42364e = new b(null, this);
        this.f42365f = new c(null, this);
        this.f42366g = new d(null, this);
        this.f42367h = new e(null, this);
        this.f42368i = new f(null, this);
        this.f42369j = new g(null, this);
    }

    private final void d() {
        com.swmansion.rnscreens.gamma.tabs.b bVar = (com.swmansion.rnscreens.gamma.tabs.b) this.f42361b.get();
        if (bVar != null) {
            bVar.c(this);
        }
    }

    private final void e() {
        com.swmansion.rnscreens.gamma.tabs.b bVar = (com.swmansion.rnscreens.gamma.tabs.b) this.f42361b.get();
        if (bVar != null) {
            bVar.d(this, this.f42370k);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(Object obj, Object obj2) {
        if (Intrinsics.b(obj2, obj)) {
            return;
        }
        d();
    }

    public final boolean b() {
        return this.f42370k;
    }

    public final void c(com.swmansion.rnscreens.gamma.tabs.e fragment, Configuration config) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(config, "config");
        com.swmansion.rnscreens.gamma.tabs.b bVar = (com.swmansion.rnscreens.gamma.tabs.b) this.f42361b.get();
        if (bVar != null) {
            bVar.b(this, config);
        }
    }

    public final void f() {
        if (getId() == -1) {
            throw new IllegalStateException("[RNScreens] TabScreen must have its tag set when registering event emitters");
        }
        setEventEmitter$react_native_screens_release(new com.swmansion.rnscreens.gamma.tabs.c(this.f42360a, getId()));
    }

    @Override // K7.b
    @Nullable
    public ComponentCallbacksC1144o getAssociatedFragment() {
        com.swmansion.rnscreens.gamma.tabs.b bVar = (com.swmansion.rnscreens.gamma.tabs.b) this.f42361b.get();
        if (bVar != null) {
            return bVar.a(this);
        }
        return null;
    }

    @Nullable
    public final String getBadgeValue() {
        return (String) this.f42365f.a(this, f42359m[1]);
    }

    @NotNull
    public final com.swmansion.rnscreens.gamma.tabs.c getEventEmitter$react_native_screens_release() {
        com.swmansion.rnscreens.gamma.tabs.c cVar = this.f42362c;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.r("eventEmitter");
        return null;
    }

    @Nullable
    public final Drawable getIcon() {
        return (Drawable) this.f42369j.a(this, f42359m[5]);
    }

    @Nullable
    public final String getIconResourceName() {
        return (String) this.f42368i.a(this, f42359m[4]);
    }

    @NotNull
    public final E0 getReactContext() {
        return this.f42360a;
    }

    @Nullable
    public final Integer getTabBarItemBadgeBackgroundColor() {
        return (Integer) this.f42367h.a(this, f42359m[3]);
    }

    @Nullable
    public final Integer getTabBarItemBadgeTextColor() {
        return (Integer) this.f42366g.a(this, f42359m[2]);
    }

    @Nullable
    public final String getTabKey() {
        return this.f42363d;
    }

    @Nullable
    public final String getTabTitle() {
        return (String) this.f42364e.a(this, f42359m[0]);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        Q7.e.f5075a.a("TabScreen", "TabScreen [" + getId() + "] attached to window");
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
    }

    public final void setBadgeValue(@Nullable String str) {
        this.f42365f.b(this, f42359m[1], str);
    }

    public final void setEventEmitter$react_native_screens_release(@NotNull com.swmansion.rnscreens.gamma.tabs.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f42362c = cVar;
    }

    public final void setFocusedTab(boolean z9) {
        if (this.f42370k != z9) {
            this.f42370k = z9;
            e();
        }
    }

    public final void setIcon(@Nullable Drawable drawable) {
        this.f42369j.b(this, f42359m[5], drawable);
    }

    public final void setIconResourceName(@Nullable String str) {
        this.f42368i.b(this, f42359m[4], str);
    }

    public final void setTabBarItemBadgeBackgroundColor(@Nullable Integer num) {
        this.f42367h.b(this, f42359m[3], num);
    }

    public final void setTabBarItemBadgeTextColor(@Nullable Integer num) {
        this.f42366g.b(this, f42359m[2], num);
    }

    public final void setTabKey(@Nullable String str) {
        if (str != null && StringsKt.b0(str)) {
            str = null;
        }
        this.f42363d = str;
    }

    public final void setTabScreenDelegate$react_native_screens_release(@Nullable com.swmansion.rnscreens.gamma.tabs.b bVar) {
        this.f42361b = new WeakReference(bVar);
    }

    public final void setTabTitle(@Nullable String str) {
        this.f42364e.b(this, f42359m[0], str);
    }
}
