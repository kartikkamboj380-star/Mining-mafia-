package com.facebook.react;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.CxxModuleWrapper;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class T extends TurboModuleManagerDelegate {

    @NotNull
    private final List<b> moduleProviders;

    @NotNull
    private final Map<b, Map<String, ReactModuleInfo>> packageModuleInfos;
    private final boolean shouldEnableLegacyModuleInterop;

    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List f14389a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ReactApplicationContext f14390b;

        public final T a() {
            ReactApplicationContext reactApplicationContext = this.f14390b;
            if (reactApplicationContext == null) {
                throw new IllegalArgumentException("The ReactApplicationContext must be provided to create ReactPackageTurboModuleManagerDelegate");
            }
            List list = this.f14389a;
            if (list != null) {
                return b(reactApplicationContext, list);
            }
            throw new IllegalArgumentException("A set of ReactPackages must be provided to create ReactPackageTurboModuleManagerDelegate");
        }

        protected abstract T b(ReactApplicationContext reactApplicationContext, List list);

        public final a c(List packages) {
            Intrinsics.checkNotNullParameter(packages, "packages");
            this.f14389a = CollectionsKt.w0(packages);
            return this;
        }

        public final a d(ReactApplicationContext reactApplicationContext) {
            this.f14390b = reactApplicationContext;
            return this;
        }
    }

    public interface b {
        NativeModule getModule(String str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected T(ReactApplicationContext reactApplicationContext, List packages, HybridData hybridData) {
        super(hybridData);
        Intrinsics.checkNotNullParameter(reactApplicationContext, "reactApplicationContext");
        Intrinsics.checkNotNullParameter(packages, "packages");
        Intrinsics.checkNotNullParameter(hybridData, "hybridData");
        this.moduleProviders = new ArrayList();
        this.packageModuleInfos = new LinkedHashMap();
        this.shouldEnableLegacyModuleInterop = p204u3.i.a() && p204u3.i.d();
        c(reactApplicationContext, packages);
    }

    private final void c(final ReactApplicationContext reactApplicationContext, List list) {
        String name;
        ReactModuleInfo reactModuleInfo;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final N n10 = (N) it.next();
            if (n10 instanceof AbstractC1272a) {
                b bVar = new b() { // from class: com.facebook.react.Q
                    @Override // com.facebook.react.T.b
                    public final NativeModule getModule(String str) {
                        return T.d(n10, reactApplicationContext, str);
                    }
                };
                this.moduleProviders.add(bVar);
                this.packageModuleInfos.put(bVar, ((AbstractC1272a) n10).getReactModuleInfoProvider().a());
            } else {
                f();
                if (f()) {
                    List<NativeModule> listCreateNativeModules = n10.createNativeModules(reactApplicationContext);
                    final LinkedHashMap linkedHashMap = new LinkedHashMap();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (NativeModule nativeModule : listCreateNativeModules) {
                        Class<?> cls = nativeModule.getClass();
                        p234x3.a aVar = (p234x3.a) cls.getAnnotation(p234x3.a.class);
                        if (aVar == null || (name = aVar.name()) == null) {
                            name = nativeModule.getName();
                            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                        }
                        String str = name;
                        if (aVar != null) {
                            String name2 = cls.getName();
                            Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                            reactModuleInfo = new ReactModuleInfo(str, name2, aVar.canOverrideExistingModule(), true, aVar.isCxxModule(), ReactModuleInfo.f14874g.a(cls));
                        } else {
                            String name3 = cls.getName();
                            Intrinsics.checkNotNullExpressionValue(name3, "getName(...)");
                            reactModuleInfo = new ReactModuleInfo(str, name3, nativeModule.canOverrideExistingModule(), true, CxxModuleWrapper.class.isAssignableFrom(cls), ReactModuleInfo.f14874g.a(cls));
                        }
                        linkedHashMap2.put(str, reactModuleInfo);
                        linkedHashMap.put(str, nativeModule);
                    }
                    b bVar2 = new b() { // from class: com.facebook.react.S
                        @Override // com.facebook.react.T.b
                        public final NativeModule getModule(String str2) {
                            return T.e(linkedHashMap, str2);
                        }
                    };
                    this.moduleProviders.add(bVar2);
                    this.packageModuleInfos.put(bVar2, linkedHashMap2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule d(N n10, ReactApplicationContext reactApplicationContext, String moduleName) {
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        return ((AbstractC1272a) n10).getModule(moduleName, reactApplicationContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule e(Map map, String module) {
        Intrinsics.checkNotNullParameter(module, "module");
        return (NativeModule) map.get(module);
    }

    private final boolean f() {
        return unstable_shouldEnableLegacyModuleInterop();
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    @NotNull
    public List<String> getEagerInitModuleNames() {
        Collection<ReactModuleInfo> collectionI;
        List listC = CollectionsKt.c();
        Iterator<b> it = this.moduleProviders.iterator();
        while (it.hasNext()) {
            Map<String, ReactModuleInfo> map = this.packageModuleInfos.get(it.next());
            if (map == null || (collectionI = map.values()) == null) {
                collectionI = CollectionsKt.i();
            }
            for (ReactModuleInfo reactModuleInfo : collectionI) {
                if (reactModuleInfo.d() && reactModuleInfo.f()) {
                    listC.add(reactModuleInfo.e());
                }
            }
        }
        return CollectionsKt.a(listC);
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    @Nullable
    public NativeModule getLegacyModule(@NotNull String moduleName) {
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        if (!unstable_shouldEnableLegacyModuleInterop()) {
            return null;
        }
        NativeModule nativeModule = null;
        for (b bVar : this.moduleProviders) {
            Map<String, ReactModuleInfo> map = this.packageModuleInfos.get(bVar);
            ReactModuleInfo reactModuleInfo = map != null ? map.get(moduleName) : null;
            if (reactModuleInfo != null && !reactModuleInfo.d() && (nativeModule == null || reactModuleInfo.a())) {
                NativeModule module = bVar.getModule(moduleName);
                if (module != null) {
                    nativeModule = module;
                }
            }
        }
        if (nativeModule instanceof TurboModule) {
            return null;
        }
        return nativeModule;
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    @Nullable
    public TurboModule getModule(@NotNull String moduleName) {
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        NativeModule nativeModule = null;
        for (b bVar : this.moduleProviders) {
            Map<String, ReactModuleInfo> map = this.packageModuleInfos.get(bVar);
            ReactModuleInfo reactModuleInfo = map != null ? map.get(moduleName) : null;
            if (reactModuleInfo != null && reactModuleInfo.d() && (nativeModule == null || reactModuleInfo.a())) {
                NativeModule module = bVar.getModule(moduleName);
                if (module != null) {
                    nativeModule = module;
                }
            }
        }
        if (!(nativeModule instanceof TurboModule)) {
            return null;
        }
        Intrinsics.d(nativeModule, "null cannot be cast to non-null type com.facebook.react.turbomodule.core.interfaces.TurboModule");
        return (TurboModule) nativeModule;
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    public boolean unstable_isLegacyModuleRegistered(@NotNull String moduleName) {
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        Iterator<b> it = this.moduleProviders.iterator();
        while (it.hasNext()) {
            Map<String, ReactModuleInfo> map = this.packageModuleInfos.get(it.next());
            ReactModuleInfo reactModuleInfo = map != null ? map.get(moduleName) : null;
            if (reactModuleInfo != null && !reactModuleInfo.d()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    public boolean unstable_isModuleRegistered(@NotNull String moduleName) {
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        Iterator<b> it = this.moduleProviders.iterator();
        while (it.hasNext()) {
            Map<String, ReactModuleInfo> map = this.packageModuleInfos.get(it.next());
            ReactModuleInfo reactModuleInfo = map != null ? map.get(moduleName) : null;
            if (reactModuleInfo != null && reactModuleInfo.d()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    public boolean unstable_shouldEnableLegacyModuleInterop() {
        return this.shouldEnableLegacyModuleInterop;
    }
}
