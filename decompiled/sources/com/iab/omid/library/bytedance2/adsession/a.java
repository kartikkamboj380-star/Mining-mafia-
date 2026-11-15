package com.iab.omid.library.bytedance2.adsession;

import android.view.View;
import androidx.annotation.NonNull;
import com.iab.omid.library.bytedance2.internal.c;
import com.iab.omid.library.bytedance2.internal.e;
import com.iab.omid.library.bytedance2.internal.f;
import com.iab.omid.library.bytedance2.internal.i;
import com.iab.omid.library.bytedance2.publisher.AdSessionStatePublisher;
import com.iab.omid.library.bytedance2.publisher.b;
import com.iab.omid.library.bytedance2.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class a extends AdSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdSessionContext f41734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdSessionConfiguration f41735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f41736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.bytedance2.weakreference.a f41737d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AdSessionStatePublisher f41738e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f41739f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f41740g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f41741h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f41742i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f41743j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PossibleObstructionListener f41744k;

    a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    private void a() {
        if (this.f41742i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void b() {
        if (this.f41743j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (this.f41740g) {
            return;
        }
        this.f41736c.a(view, friendlyObstructionPurpose, str);
    }

    public View c() {
        return this.f41737d.get();
    }

    public List<e> d() {
        return this.f41736c.a();
    }

    public boolean e() {
        return this.f41744k != null;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f41740g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.a(errorType, "Error type is null");
        g.a(str, "Message is null");
        getAdSessionStatePublisher().a(errorType, str);
    }

    public boolean f() {
        return this.f41739f && !this.f41740g;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void finish() {
        if (this.f41740g) {
            return;
        }
        this.f41737d.clear();
        removeAllFriendlyObstructions();
        this.f41740g = true;
        getAdSessionStatePublisher().f();
        c.c().b(this);
        getAdSessionStatePublisher().b();
        this.f41738e = null;
        this.f41744k = null;
    }

    public boolean g() {
        return this.f41740g;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public String getAdSessionId() {
        return this.f41741h;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f41738e;
    }

    public boolean h() {
        return this.f41735b.isNativeImpressionOwner();
    }

    public boolean i() {
        return this.f41735b.isNativeMediaEventsOwner();
    }

    public boolean j() {
        return this.f41739f;
    }

    void k() {
        a();
        getAdSessionStatePublisher().g();
        this.f41742i = true;
    }

    void l() {
        b();
        getAdSessionStatePublisher().h();
        this.f41743j = true;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f41740g) {
            return;
        }
        g.a(view, "AdView is null");
        if (c() == view) {
            return;
        }
        b(view);
        getAdSessionStatePublisher().a();
        a(view);
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f41740g) {
            return;
        }
        this.f41736c.b();
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f41740g) {
            return;
        }
        this.f41736c.c(view);
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f41744k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void start() {
        if (this.f41739f) {
            return;
        }
        this.f41739f = true;
        c.c().c(this);
        this.f41738e.a(i.c().b());
        this.f41738e.a(com.iab.omid.library.bytedance2.internal.a.a().b());
        this.f41738e.a(this, this.f41734a);
    }

    a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f41736c = new f();
        this.f41739f = false;
        this.f41740g = false;
        this.f41735b = adSessionConfiguration;
        this.f41734a = adSessionContext;
        this.f41741h = str;
        b(null);
        this.f41738e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.bytedance2.publisher.a(str, adSessionContext.getWebView()) : new b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f41738e.i();
        c.c().a(this);
        this.f41738e.a(adSessionConfiguration);
    }

    private void a(View view) {
        Collection<a> collectionB = c.c().b();
        if (collectionB == null || collectionB.isEmpty()) {
            return;
        }
        for (a aVar : collectionB) {
            if (aVar != this && aVar.c() == view) {
                aVar.f41737d.clear();
            }
        }
    }

    private void b(View view) {
        this.f41737d = new com.iab.omid.library.bytedance2.weakreference.a(view);
    }

    public void a(List<com.iab.omid.library.bytedance2.weakreference.a> list) {
        if (e()) {
            ArrayList arrayList = new ArrayList();
            Iterator<com.iab.omid.library.bytedance2.weakreference.a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f41744k.onPossibleObstructionsDetected(this.f41741h, arrayList);
        }
    }

    void a(@NonNull JSONObject jSONObject) {
        b();
        getAdSessionStatePublisher().a(jSONObject);
        this.f41743j = true;
    }
}
