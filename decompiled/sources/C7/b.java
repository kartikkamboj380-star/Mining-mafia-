package C7;

import com.facebook.react.Y;
import com.facebook.react.Z;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.uimanager.ViewManager;
import com.reactnativecommunity.clipboard.ClipboardModule;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class b extends Y implements Z {

    class a implements p244y3.a {
        a() {
        }

        @Override // p244y3.a
        public Map a() {
            HashMap map = new HashMap();
            Class cls = new Class[]{ClipboardModule.class}[0];
            p234x3.a aVar = (p234x3.a) cls.getAnnotation(p234x3.a.class);
            map.put(aVar.name(), new ReactModuleInfo(aVar.name(), cls.getName(), aVar.canOverrideExistingModule(), aVar.needsEagerInit(), aVar.hasConstants(), aVar.isCxxModule(), TurboModule.class.isAssignableFrom(cls)));
            return map;
        }
    }

    @Override // com.facebook.react.AbstractC1272a, com.facebook.react.N
    public List createNativeModules(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ClipboardModule(reactApplicationContext));
        return arrayList;
    }

    @Override // com.facebook.react.Z
    public ViewManager createViewManager(ReactApplicationContext reactApplicationContext, String str) {
        return null;
    }

    @Override // com.facebook.react.AbstractC1272a, com.facebook.react.N
    public List createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.EMPTY_LIST;
    }

    @Override // com.facebook.react.AbstractC1272a, com.facebook.react.N
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        str.getClass();
        if (str.equals("RNCClipboard")) {
            return new ClipboardModule(reactApplicationContext);
        }
        return null;
    }

    @Override // com.facebook.react.AbstractC1272a
    public p244y3.a getReactModuleInfoProvider() {
        try {
            return (p244y3.a) Class.forName("com.reactnativecommunity.clipboard.ClipboardPackage$$ReactModuleInfoProvider").newInstance();
        } catch (ClassNotFoundException unused) {
            return new a();
        } catch (IllegalAccessException e10) {
            e = e10;
            throw new RuntimeException("No ReactModuleInfoProvider for com.reactnativecommunity.clipboard.ClipboardPackage$$ReactModuleInfoProvider", e);
        } catch (InstantiationException e11) {
            e = e11;
            throw new RuntimeException("No ReactModuleInfoProvider for com.reactnativecommunity.clipboard.ClipboardPackage$$ReactModuleInfoProvider", e);
        }
    }

    @Override // com.facebook.react.AbstractC1272a
    protected List getViewManagers(ReactApplicationContext reactApplicationContext) {
        return null;
    }

    @Override // com.facebook.react.Z
    public List getViewManagerNames(ReactApplicationContext reactApplicationContext) {
        return Collections.EMPTY_LIST;
    }
}
