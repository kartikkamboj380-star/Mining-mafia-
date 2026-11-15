package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class c implements j, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Context f7624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    LayoutInflater f7625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    e f7626c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    ExpandedMenuView f7627d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f7628e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f7629f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f7630g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private j.a f7631h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    a f7632i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f7633j;

    private class a extends BaseAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f7634a = -1;

        public a() {
            a();
        }

        void a() {
            g gVarX = c.this.f7626c.x();
            if (gVarX != null) {
                ArrayList arrayListB = c.this.f7626c.B();
                int size = arrayListB.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (((g) arrayListB.get(i10)) == gVarX) {
                        this.f7634a = i10;
                        return;
                    }
                }
            }
            this.f7634a = -1;
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g getItem(int i10) {
            ArrayList arrayListB = c.this.f7626c.B();
            int i11 = i10 + c.this.f7628e;
            int i12 = this.f7634a;
            if (i12 >= 0 && i11 >= i12) {
                i11++;
            }
            return (g) arrayListB.get(i11);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = c.this.f7626c.B().size() - c.this.f7628e;
            return this.f7634a < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                c cVar = c.this;
                view = cVar.f7625b.inflate(cVar.f7630g, viewGroup, false);
            }
            ((k.a) view).f(getItem(i10), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public c(Context context, int i10) {
        this(i10, 0);
        this.f7624a = context;
        this.f7625b = LayoutInflater.from(context);
    }

    public ListAdapter a() {
        if (this.f7632i == null) {
            this.f7632i = new a();
        }
        return this.f7632i;
    }

    @Override // androidx.appcompat.view.menu.j
    public void b(e eVar, boolean z9) {
        j.a aVar = this.f7631h;
        if (aVar != null) {
            aVar.b(eVar, z9);
        }
    }

    public k c(ViewGroup viewGroup) {
        if (this.f7627d == null) {
            this.f7627d = (ExpandedMenuView) this.f7625b.inflate(p060g.g.f43996g, viewGroup, false);
            if (this.f7632i == null) {
                this.f7632i = new a();
            }
            this.f7627d.setAdapter((ListAdapter) this.f7632i);
            this.f7627d.setOnItemClickListener(this);
        }
        return this.f7627d;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean d(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void e(j.a aVar) {
        this.f7631h = aVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public void f(Parcelable parcelable) {
        m((Bundle) parcelable);
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean g(m mVar) {
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        new f(mVar).d(null);
        j.a aVar = this.f7631h;
        if (aVar == null) {
            return true;
        }
        aVar.c(mVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.j
    public int getId() {
        return this.f7633j;
    }

    @Override // androidx.appcompat.view.menu.j
    public Parcelable h() {
        if (this.f7627d == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        n(bundle);
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.j
    public void i(boolean z9) {
        a aVar = this.f7632i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean j() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean k(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void l(Context context, e eVar) {
        if (this.f7629f != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f7629f);
            this.f7624a = contextThemeWrapper;
            this.f7625b = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f7624a != null) {
            this.f7624a = context;
            if (this.f7625b == null) {
                this.f7625b = LayoutInflater.from(context);
            }
        }
        this.f7626c = eVar;
        a aVar = this.f7632i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public void m(Bundle bundle) {
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f7627d.restoreHierarchyState(sparseParcelableArray);
        }
    }

    public void n(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f7627d;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        this.f7626c.P(this.f7632i.getItem(i10), this, 0);
    }

    public c(int i10, int i11) {
        this.f7630g = i10;
        this.f7629f = i11;
    }
}
