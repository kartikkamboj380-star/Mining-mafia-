package O;

import android.view.Menu;
import android.view.MenuItem;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes.dex */
public abstract class B {

    public static final class a implements Sequence {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Menu f3735a;

        a(Menu menu) {
            this.f3735a = menu;
        }

        @Override // kotlin.sequences.Sequence
        public Iterator iterator() {
            return B.b(this.f3735a);
        }
    }

    public static final class b implements Iterator, A8.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f3736a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Menu f3737b;

        b(Menu menu) {
            this.f3737b = menu;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MenuItem next() {
            Menu menu = this.f3737b;
            int i10 = this.f3736a;
            this.f3736a = i10 + 1;
            MenuItem item = menu.getItem(i10);
            if (item != null) {
                return item;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f3736a < this.f3737b.size();
        }

        @Override // java.util.Iterator
        public void remove() {
            Unit unit;
            Menu menu = this.f3737b;
            int i10 = this.f3736a - 1;
            this.f3736a = i10;
            MenuItem item = menu.getItem(i10);
            if (item != null) {
                menu.removeItem(item.getItemId());
                unit = Unit.f45918a;
            } else {
                unit = null;
            }
            if (unit == null) {
                throw new IndexOutOfBoundsException();
            }
        }
    }

    public static final Sequence a(Menu menu) {
        return new a(menu);
    }

    public static final Iterator b(Menu menu) {
        return new b(menu);
    }
}
