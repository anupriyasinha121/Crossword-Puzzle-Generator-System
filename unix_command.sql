PGDMP     9    %                v            dbms_project    9.6.6    9.6.6 
    p           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                       false            q           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                       false            r           1262    16554    dbms_project    DATABASE     r   CREATE DATABASE dbms_project WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'en_IN' LC_CTYPE = 'en_IN';
    DROP DATABASE dbms_project;
             postgres    false                        2615    2200    public    SCHEMA        CREATE SCHEMA public;
    DROP SCHEMA public;
             postgres    false            s           0    0    SCHEMA public    COMMENT     6   COMMENT ON SCHEMA public IS 'standard public schema';
                  postgres    false    3                        3079    12427    plpgsql 	   EXTENSION     ?   CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;
    DROP EXTENSION plpgsql;
                  false            t           0    0    EXTENSION plpgsql    COMMENT     @   COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';
                       false    1            �            1259    16555    commands_list    TABLE     �   CREATE TABLE commands_list (
    sno integer NOT NULL,
    commands character varying(20) NOT NULL,
    description text NOT NULL
);
 !   DROP TABLE public.commands_list;
       public         postgres    false    3            m          0    16555    commands_list 
   TABLE DATA               <   COPY commands_list (sno, commands, description) FROM stdin;
    public       postgres    false    185   �       �           2606    16562     commands_list commands_list_pkey 
   CONSTRAINT     X   ALTER TABLE ONLY commands_list
    ADD CONSTRAINT commands_list_pkey PRIMARY KEY (sno);
 J   ALTER TABLE ONLY public.commands_list DROP CONSTRAINT commands_list_pkey;
       public         postgres    false    185    185            m   =  x��T�n�6<7��?��%�y^���"0�-�ؒ��H���ߧHi�I��\�!��U���QH9����ɩ����d^X�%FvY��GN����k�er2��4N�1++����('W��h\���ޒ6�D�_����q,��-�b���%�/���~�N^&�c�+���?9|*7o�$��Y�8G_�x��ä`�Y~7���2�l"kR��D��g9z�a[�M!xyW���ygY��E�E��C�1����,2�Iu�%��|}�!U�Q�D]��V��O�i��U.�6��n=���ѱ�@�/.o�H@��2������)Պ�!���#��]=T����S���{:͜�W:� �Qm��J<J��W���OG�IŃ�Q�Ʒ��͝ϯ�RW/�.�g�qvp����S+oL}��7�6���
���=I��c��5+���e�LV������5���Ԉ<�V����?���d?z+��/1j��<W.��Rǭp�����b��K%�d$(�М�hB,��6-�I<-l텾�o�h���U�Lfv���U��QV�2�Yg0%m�[�EO�q�j��|~����b�M ΢ �35+s��Wm������$V��������D3Vў�jIB�����
QMpb�!�1���҂�ч�]1t�c�B0r�+ǧ�'�T��5O���yt5hb�)�؊����yo@uHO��ٶ�64�(S�I)	>����l�z>�#pm�� ��m)�y�gr�G4���*���*�_���UX�d=&�[�w}X�mD��zA$~W�T����rx�u��[i��_�౬m�����ow�0?     