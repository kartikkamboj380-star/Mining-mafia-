package com.facebook.react;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.uimanager.ViewManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import javax.inject.Provider;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.facebook.react.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1272a implements N {

    /* JADX INFO: renamed from: com.facebook.react.a$a, reason: collision with other inner class name */
    private final class C0330a implements Provider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f14416a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ReactApplicationContext f14417b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC1272a f14418c;

        public C0330a(AbstractC1272a abstractC1272a, String name, ReactApplicationContext reactContext) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(reactContext, "reactContext");
            this.f14418c = abstractC1272a;
            this.f14416a = name;
            this.f14417b = reactContext;
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return this.f14418c.getModule(this.f14416a, this.f14417b);
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.a$b */
    public static final class b implements Iterable, A8.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterator f14419a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC1272a f14420b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ReactApplicationContext f14421c;

        public b(Iterator it, AbstractC1272a abstractC1272a, ReactApplicationContext reactApplicationContext) {
            this.f14419a = it;
            this.f14420b = abstractC1272a;
            this.f14421c = reactApplicationContext;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return new c(this.f14419a, this.f14420b, this.f14421c);
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.a$c */
    public static final class c implements Iterator, A8.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Map.Entry f14422a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Iterator f14423b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC1272a f14424c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ReactApplicationContext f14425d;

        c(Iterator it, AbstractC1272a abstractC1272a, ReactApplicationContext reactApplicationContext) {
            this.f14423b = it;
            this.f14424c = abstractC1272a;
            this.f14425d = reactApplicationContext;
        }

        private final void a() {
            while (this.f14423b.hasNext()) {
                Map.Entry entry = (Map.Entry) this.f14423b.next();
                ReactModuleInfo reactModuleInfo = (ReactModuleInfo) entry.getValue();
                if (!p204u3.i.e() || !reactModuleInfo.d()) {
                    this.f14422a = entry;
                    return;
                }
            }
            this.f14422a = null;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ModuleHolder next() {
            if (this.f14422a == null) {
                a();
            }
            Map.Entry entry = this.f14422a;
            if (entry == null) {
                throw new NoSuchElementException("ModuleHolder not found");
            }
            a();
            return new ModuleHolder((ReactModuleInfo) entry.getValue(), new C0330a(this.f14424c, (String) entry.getKey(), this.f14425d));
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f14422a == null) {
                a();
            }
            return this.f14422a != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // com.facebook.react.N
    @NotNull
    public List<NativeModule> createNativeModules(@NotNull ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        throw new UnsupportedOperationException("createNativeModules method is not supported. Use getModule() method instead.");
    }

    @Override // com.facebook.react.N
    @NotNull
    public List<ViewManager> createViewManagers(@NotNull ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        List<ModuleSpec> viewManagers = getViewManagers(reactContext);
        if (viewManagers == null || viewManagers.isEmpty()) {
            return CollectionsKt.i();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<ModuleSpec> it = viewManagers.iterator();
        while (it.hasNext()) {
            Object obj = it.next().provider().get();
            Intrinsics.d(obj, "null cannot be cast to non-null type com.facebook.react.uimanager.ViewManager<*, *>");
            arrayList.add((ViewManager) obj);
        }
        return arrayList;
    }

    @Override // com.facebook.react.N
    public abstract NativeModule getModule(String str, ReactApplicationContext reactApplicationContext);

    @NotNull
    public final Iterable<ModuleHolder> getNativeModuleIterator$ReactAndroid_release(@NotNull ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return new b(getReactModuleInfoProvider().a().entrySet().iterator(), this, reactContext);
    }

    public abstract p244y3.a getReactModuleInfoProvider();

    @NotNull
    protected List<ModuleSpec> getViewManagers(@NotNull ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return CollectionsKt.i();
    }
}
