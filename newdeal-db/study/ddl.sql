-- ������û
DROP TABLE IF EXISTS nd_appl RESTRICT;

-- ����
DROP TABLE IF EXISTS nd_lesn RESTRICT;

-- ����
DROP TABLE IF EXISTS nd_tchr RESTRICT;

-- ������
DROP TABLE IF EXISTS nd_stud RESTRICT;

-- �Ŵ���
DROP TABLE IF EXISTS nd_mgr RESTRICT;

-- ���ǽ�
DROP TABLE IF EXISTS nd_cls_room RESTRICT;

-- �ּ�
DROP TABLE IF EXISTS nd_addr RESTRICT;

-- �������
DROP TABLE IF EXISTS nd_lesn_tchr RESTRICT;

-- ȸ��
DROP TABLE IF EXISTS nd_memb RESTRICT;

-- ������û
CREATE TABLE nd_appl (
  aplno  INTEGER  NOT NULL COMMENT '������û��ȣ', -- ������û��ȣ
  reg_dt DATETIME NOT NULL COMMENT '��û��', -- ��û��
  stat   CHAR(1)  NULL     COMMENT '��û����', -- ��û����
  lno    INTEGER  NOT NULL COMMENT '������ȣ', -- ������ȣ
  mno    INTEGER  NOT NULL COMMENT '��������ȣ' -- ��������ȣ
)
COMMENT '������û';

-- ������û
ALTER TABLE nd_appl
  ADD CONSTRAINT PK_nd_appl -- ������û �⺻Ű
    PRIMARY KEY (
      aplno -- ������û��ȣ
    );

ALTER TABLE nd_appl
  MODIFY COLUMN aplno INTEGER NOT NULL AUTO_INCREMENT COMMENT '������û��ȣ';

-- ����
CREATE TABLE nd_lesn (
  lno    INTEGER      NOT NULL COMMENT '������ȣ', -- ������ȣ
  title  VARCHAR(255) NOT NULL COMMENT '����', -- ����
  sdt    DATE         NOT NULL COMMENT '������', -- ������
  edt    DATE         NOT NULL COMMENT '������', -- ������
  tot_hr INTEGER      NOT NULL COMMENT '�ѱ����ð�', -- �ѱ����ð�
  day_hr INTEGER      NOT NULL COMMENT '�ϱ����ð�', -- �ϱ����ð�
  crno   INTEGER      NULL     COMMENT '���ǽǹ�ȣ', -- ���ǽǹ�ȣ
  mno    INTEGER      NULL     COMMENT '�Ŵ�����ȣ' -- �Ŵ�����ȣ
)
COMMENT '����';

-- ����
ALTER TABLE nd_lesn
  ADD CONSTRAINT PK_nd_lesn -- ���� �⺻Ű
    PRIMARY KEY (
      lno -- ������ȣ
    );

-- ���� �ε���
CREATE INDEX IX_nd_lesn
  ON nd_lesn( -- ����
    title ASC -- ����
  );

ALTER TABLE nd_lesn
  MODIFY COLUMN lno INTEGER NOT NULL AUTO_INCREMENT COMMENT '������ȣ';

-- ����
CREATE TABLE nd_tchr (
  mno    INTEGER NOT NULL COMMENT '�����ȣ', -- �����ȣ
  pay_hr INTEGER NULL     COMMENT '���Ƿ�' -- ���Ƿ�
)
COMMENT '����';

-- ����
ALTER TABLE nd_tchr
  ADD CONSTRAINT PK_nd_tchr -- ���� �⺻Ű
    PRIMARY KEY (
      mno -- �����ȣ
    );

-- ������
CREATE TABLE nd_stud (
  mno      INTEGER      NOT NULL COMMENT '��������ȣ', -- ��������ȣ
  ano      INTEGER      NULL     COMMENT '�ּҹ�ȣ', -- �ּҹ�ȣ
  det_addr VARCHAR(255) NULL     COMMENT '���ּ�' -- ���ּ�
)
COMMENT '������';

-- ������
ALTER TABLE nd_stud
  ADD CONSTRAINT PK_nd_stud -- ������ �⺻Ű
    PRIMARY KEY (
      mno -- ��������ȣ
    );

-- �Ŵ���
CREATE TABLE nd_mgr (
  mno  INTEGER     NOT NULL COMMENT '�Ŵ�����ȣ', -- �Ŵ�����ȣ
  posi VARCHAR(50) NULL     COMMENT '����' -- ����
)
COMMENT '�Ŵ���';

-- �Ŵ���
ALTER TABLE nd_mgr
  ADD CONSTRAINT PK_nd_mgr -- �Ŵ��� �⺻Ű
    PRIMARY KEY (
      mno -- �Ŵ�����ȣ
    );

-- ���ǽ�
CREATE TABLE nd_cls_room (
  crno INTEGER     NOT NULL COMMENT '���ǽǹ�ȣ', -- ���ǽǹ�ȣ
  loc  VARCHAR(50) NULL     COMMENT '��������', -- ��������
  room VARCHAR(50) NULL     COMMENT '���ǽ�' -- ���ǽ�
)
COMMENT '���ǽ�';

-- ���ǽ�
ALTER TABLE nd_cls_room
  ADD CONSTRAINT PK_nd_cls_room -- ���ǽ� �⺻Ű
    PRIMARY KEY (
      crno -- ���ǽǹ�ȣ
    );

-- ���ǽ� ����ũ �ε���
CREATE UNIQUE INDEX UIX_nd_cls_room
  ON nd_cls_room ( -- ���ǽ�
    loc ASC,  -- ��������
    room ASC  -- ���ǽ�
  );

ALTER TABLE nd_cls_room
  MODIFY COLUMN crno INTEGER NOT NULL AUTO_INCREMENT COMMENT '���ǽǹ�ȣ';

-- �ּ�
CREATE TABLE nd_addr (
  ano      INTEGER      NOT NULL COMMENT '�ּҹ�ȣ', -- �ּҹ�ȣ
  pst_no   VARCHAR(10)  NOT NULL COMMENT '�����ȣ', -- �����ȣ
  bas_addr VARCHAR(255) NOT NULL COMMENT '�⺻�ּ�' -- �⺻�ּ�
)
COMMENT '�ּ�';

-- �ּ�
ALTER TABLE nd_addr
  ADD CONSTRAINT PK_nd_addr -- �ּ� �⺻Ű
    PRIMARY KEY (
      ano -- �ּҹ�ȣ
    );

ALTER TABLE nd_addr
  MODIFY COLUMN ano INTEGER NOT NULL AUTO_INCREMENT COMMENT '�ּҹ�ȣ';

-- �������
CREATE TABLE nd_lesn_tchr (
  lno INTEGER NOT NULL COMMENT '������ȣ', -- ������ȣ
  mno INTEGER NOT NULL COMMENT '�����ȣ' -- �����ȣ
)
COMMENT '�������';

-- �������
ALTER TABLE nd_lesn_tchr
  ADD CONSTRAINT PK_nd_lesn_tchr -- ������� �⺻Ű
    PRIMARY KEY (
      lno, -- ������ȣ
      mno  -- �����ȣ
    );

-- ȸ��
CREATE TABLE nd_memb (
  mno   INTEGER     NOT NULL COMMENT 'ȸ����ȣ', -- ȸ����ȣ
  name  VARCHAR(50) NOT NULL COMMENT '�̸�', -- �̸�
  tel   VARCHAR(30) NULL     COMMENT '��ȭ', -- ��ȭ
  email VARCHAR(40) NOT NULL COMMENT '�̸���', -- �̸���
  pwd   VARCHAR(80) NOT NULL COMMENT '��ȣ' -- ��ȣ
)
COMMENT 'ȸ��';

-- ȸ��
ALTER TABLE nd_memb
  ADD CONSTRAINT PK_nd_memb -- ȸ�� �⺻Ű
    PRIMARY KEY (
      mno -- ȸ����ȣ
    );

-- ȸ�� ����ũ �ε���
CREATE UNIQUE INDEX UIX_nd_memb
  ON nd_memb ( -- ȸ��
    email ASC -- �̸���
  );

ALTER TABLE nd_memb
  MODIFY COLUMN mno INTEGER NOT NULL AUTO_INCREMENT COMMENT 'ȸ����ȣ';

-- ������û
ALTER TABLE nd_appl
  ADD CONSTRAINT FK_nd_lesn_TO_nd_appl -- ���� -> ������û
    FOREIGN KEY (
      lno -- ������ȣ
    )
    REFERENCES nd_lesn ( -- ����
      lno -- ������ȣ
    );

-- ������û
ALTER TABLE nd_appl
  ADD CONSTRAINT FK_nd_stud_TO_nd_appl -- ������ -> ������û
    FOREIGN KEY (
      mno -- ��������ȣ
    )
    REFERENCES nd_stud ( -- ������
      mno -- ��������ȣ
    );

-- ����
ALTER TABLE nd_lesn
  ADD CONSTRAINT FK_nd_cls_room_TO_nd_lesn -- ���ǽ� -> ����
    FOREIGN KEY (
      crno -- ���ǽǹ�ȣ
    )
    REFERENCES nd_cls_room ( -- ���ǽ�
      crno -- ���ǽǹ�ȣ
    );

-- ����
ALTER TABLE nd_lesn
  ADD CONSTRAINT FK_nd_mgr_TO_nd_lesn -- �Ŵ��� -> ����
    FOREIGN KEY (
      mno -- �Ŵ�����ȣ
    )
    REFERENCES nd_mgr ( -- �Ŵ���
      mno -- �Ŵ�����ȣ
    );

-- ����
ALTER TABLE nd_tchr
  ADD CONSTRAINT FK_nd_memb_TO_nd_tchr -- ȸ�� -> ����
    FOREIGN KEY (
      mno -- �����ȣ
    )
    REFERENCES nd_memb ( -- ȸ��
      mno -- ȸ����ȣ
    );

-- ������
ALTER TABLE nd_stud
  ADD CONSTRAINT FK_nd_addr_TO_nd_stud -- �ּ� -> ������
    FOREIGN KEY (
      ano -- �ּҹ�ȣ
    )
    REFERENCES nd_addr ( -- �ּ�
      ano -- �ּҹ�ȣ
    );

-- ������
ALTER TABLE nd_stud
  ADD CONSTRAINT FK_nd_memb_TO_nd_stud -- ȸ�� -> ������
    FOREIGN KEY (
      mno -- ��������ȣ
    )
    REFERENCES nd_memb ( -- ȸ��
      mno -- ȸ����ȣ
    );

-- �Ŵ���
ALTER TABLE nd_mgr
  ADD CONSTRAINT FK_nd_memb_TO_nd_mgr -- ȸ�� -> �Ŵ���
    FOREIGN KEY (
      mno -- �Ŵ�����ȣ
    )
    REFERENCES nd_memb ( -- ȸ��
      mno -- ȸ����ȣ
    );

-- �������
ALTER TABLE nd_lesn_tchr
  ADD CONSTRAINT FK_nd_lesn_TO_nd_lesn_tchr -- ���� -> �������
    FOREIGN KEY (
      lno -- ������ȣ
    )
    REFERENCES nd_lesn ( -- ����
      lno -- ������ȣ
    );

-- �������
ALTER TABLE nd_lesn_tchr
  ADD CONSTRAINT FK_nd_tchr_TO_nd_lesn_tchr -- ���� -> �������
    FOREIGN KEY (
      mno -- �����ȣ
    )
    REFERENCES nd_tchr ( -- ����
      mno -- �����ȣ
    );