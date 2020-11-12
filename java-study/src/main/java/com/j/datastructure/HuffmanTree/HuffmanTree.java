package com.j.datastructure.HuffmanTree;

import org.omg.PortableInterceptor.INACTIVE;

/**
 * @ClassName Huffman
 * @Description
 * @Author orange
 * @Date 2020-11-12 16:49
 **/

public class HuffmanTree {
    private String charset;
    private TriElement[] element;

    public HuffmanTree(int[] weights) {
        this.charset = "";
        int n = weights.length;

        for (int i = 0; i < weights.length; i++) {
            this.charset += (char) ('A' + i);
        }
        this.element = new TriElement[2 * n - 1];
        for (int i = 0; i < n; i++) {
            this.element[i] = new TriElement(weights[i]);
        }

        for (int i = n; i < 2 * n - 1; i++) {
            int min1 = Integer.MAX_VALUE, min2 = min1;
            int x1 = -1, x2 = -1;

            for (int j = 0; j < i; j++) {
                if (this.element[j].parent == -1) {
                    if (this.element[j].data < min1) {
                        min2 = min1;
                        x2 = x1;
                        min1 = this.element[j].data;
                        x1 = j;
                    } else if (this.element[j].data < min2) {
                        min2 = element[j].data;
                        x2 = j;
                    }
                }
            }

            this.element[x1].parent = i;
            this.element[x2].parent = i;
            this.element[i] = new TriElement(min1 + min2, -1, x1, x2);
        }
    }

    public String huffmanCode(int i) {
        int n = 8;
        char code[] = new char[n];
        int child = i, parent = this.element[child].parent;

        for (i = n - 1; parent != -1; i--) {
            code[i] = (element[parent].left == child) ? '0' : '1';
            child = parent;
            parent = element[child].parent;
        }
        return new String(code, i + 1, n - 1 - i);
    }

    @Override
    public String toString() {
        String str = "Huffman树的结点数组:";

        for (int i = 0; i < this.element.length; i++) {
            str += this.element[i].toString() + ",";
        }
        str += "\nHuffman编码：";

        for (int i = 0; i < this.charset.length(); i++) {
            str += this.charset.charAt(i) + ": " + huffmanCode(i) + ",";
        }
        return str;
    }

    public String encode(String text) {
        String compressed = "";

        for (int i = 0; i < text.length(); i++) {
            int j = text.charAt(i) - 'A';
            compressed += this.huffmanCode(j);
        }
        return compressed;
    }

    public String decode(String compressed) {
        String text = "";
        int node = this.element.length - 1;

        for (int i = 0; i < compressed.length(); i++) {
            if (compressed.charAt(i) == '0') {
                node = element[node].left;
            } else {
                node = element[node].right;
            }
            if (element[node].isLeaf()) {
                text += this.charset.charAt(node);
                node = this.element.length - 1;
            }
        }
        return text;
    }

    public static void main(String[] args) {
        String text = "AAAABBBCDDBBAAA";
        int[] weights = {7, 5, 1, 2};
        HuffmanTree huftree = new HuffmanTree(weights);
        System.out.println(huftree.toString());
        String compressed = huftree.encode(text);
        System.out.println("将" + text + "压缩为" + compressed + "," + compressed.length() + "位");
        System.out.println("将" + compressed + "解码位" + huftree.decode(compressed));
    }
}
