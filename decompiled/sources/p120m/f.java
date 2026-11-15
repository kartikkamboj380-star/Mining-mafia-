package p120m;

import H.b;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;
import p130n.c;
import p130n.d;
import p190t.k;

/* JADX INFO: loaded from: classes.dex */
public class f extends ActionMode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Context f46282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final b f46283b;

    public static class a implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ActionMode.Callback f46284a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Context f46285b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final ArrayList f46286c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final k f46287d = new k();

        public a(Context context, ActionMode.Callback callback) {
            this.f46285b = context;
            this.f46284a = callback;
        }

        private Menu f(Menu menu) {
            Menu menu2 = (Menu) this.f46287d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            d dVar = new d(this.f46285b, (H.a) menu);
            this.f46287d.put(menu, dVar);
            return dVar;
        }

        @Override // m.b.a
        public void a(b bVar) {
            this.f46284a.onDestroyActionMode(e(bVar));
        }

        @Override // m.b.a
        public boolean b(b bVar, Menu menu) {
            return this.f46284a.onPrepareActionMode(e(bVar), f(menu));
        }

        @Override // m.b.a
        public boolean c(b bVar, Menu menu) {
            return this.f46284a.onCreateActionMode(e(bVar), f(menu));
        }

        @Override // m.b.a
        public boolean d(b bVar, MenuItem menuItem) {
            return this.f46284a.onActionItemClicked(e(bVar), new c(this.f46285b, (b) menuItem));
        }

        public ActionMode e(b bVar) {
            int size = this.f46286c.size();
            for (int i10 = 0; i10 < size; i10++) {
                f fVar = (f) this.f46286c.get(i10);
                if (fVar != null && fVar.f46283b == bVar) {
                    return fVar;
                }
            }
            f fVar2 = new f(this.f46285b, bVar);
            this.f46286c.add(fVar2);
            return fVar2;
        }
    }

    public f(Context context, b bVar) {
        this.f46282a = context;
        this.f46283b = bVar;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f46283b.c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f46283b.d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new d(this.f46282a, (H.a) this.f46283b.e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f46283b.f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f46283b.g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f46283b.h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f46283b.i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f46283b.j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f46283b.k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f46283b.l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f46283b.m(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f46283b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f46283b.p(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f46283b.r(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z9) {
        this.f46283b.s(z9);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i10) {
        this.f46283b.n(i10);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i10) {
        this.f46283b.q(i10);
    }
}
